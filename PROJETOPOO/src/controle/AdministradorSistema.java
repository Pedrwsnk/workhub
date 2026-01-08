package controle;

import entidades.*;
import excecoes.*;
import java.time.Duration;
import java.util.*;

public class AdministradorSistema {

    private RepositorioClientes repoClientes;
    private RepositorioEspacos repoEspacos;
    private RepositorioReservas repoReservas;

    public AdministradorSistema() {
        this.repoClientes = new RepositorioClientes();
        this.repoEspacos = new RepositorioEspacos();
        this.repoReservas = new RepositorioReservas();
    }

    public void cadastrarCliente(Cliente c) throws ClienteJaCadastradoException {
        if (repoClientes.buscar(c.getCpf()) != null) {
            throw new ClienteJaCadastradoException("CPF já existente.");
        }
        repoClientes.inserir(c);
    }

    public void realizarReserva(Reserva nova) throws EspacoIndisponivelException {
        for (Reserva r : repoReservas.listarTodas()) {
            if (r.getEspaco().getId().equals(nova.getEspaco().getId()) && 
                r.getDataReserva().equals(nova.getDataReserva())) {
                
                if (nova.getHoraInicio().isBefore(r.getHoraFim()) && 
                    nova.getHoraFim().isAfter(r.getHoraInicio())) {
                    throw new EspacoIndisponivelException("Espaço ocupado neste horário.");
                }
            }
        }

        long horas = Duration.between(nova.getHoraInicio(), nova.getHoraFim()).toHours();
        double valorEspaco = horas * nova.getEspaco().getValorHora();
        double valorServicos = nova.getServicosAdicionais().stream()
                                  .mapToDouble(s -> s.getValorTotal()).sum();
        
        nova.setValorTotal(valorEspaco + valorServicos);
        repoReservas.inserir(nova);
    }

    public List<Reserva> relatorioPorCliente(String cpf) {
        List<Reserva> lista = new ArrayList<>();
        for (Reserva r : repoReservas.listarTodas()) {
            if (r.getCliente().getCpf().equals(cpf)) lista.add(r);
        }
        return lista;
    }
}