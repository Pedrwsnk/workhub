package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Reserva implements Serializable {
    private int id;
    private Cliente cliente;
    private Espaco espaco;
    private LocalDate dataReserva;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private List<ServicoAdicional> servicosAdicionais;
    private double valorTotal;

    public Reserva(int id, Cliente cliente, Espaco espaco, LocalDate dataReserva, LocalTime horaInicio, LocalTime horaFim) {
        this.id = id;
        this.cliente = cliente;
        this.espaco = espaco;
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.servicosAdicionais = new ArrayList<>();
        this.valorTotal = calcularValorInicial();
    }

    private double calcularValorInicial() {
        long horas = java.time.Duration.between(horaInicio, horaFim).toHours();
        if (horas <= 0) horas = 1; 
        return horas * espaco.getValorHora();
    }

    public double calcularPrecoFinal() {
    long horas = java.time.Duration.between(horaInicio, horaFim).toHours();
    if (horas <= 0) horas = 1;
    double totalServicos = servicos.stream().mapToDouble(ServicoAdicional::getValorTotal).sum();
    return (horas * espaco.getValorHora()) + totalServicos;
}

    public void adicionarServico(ServicoAdicional servico) {
        this.servicosAdicionais.add(servico);
        this.valorTotal += servico.getValorTotal();
    }

    public int getId() { 
        return id;
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    public Espaco getEspaco() { 
        return espaco; 
    }
    public LocalDate getDataReserva() { 
        return dataReserva; 
    }
    public LocalTime getHoraInicio() { 
        return horaInicio; 
    }
    public LocalTime getHoraFim() { 
        return horaFim; 
    }
    public List<ServicoAdicional> getServicosAdicionais() { 
        return servicosAdicionais; 
    }
    public double getValorTotal() { 
        return valorTotal; 
    }

    @Override
    public String toString() {
        return "Reserva #" + id + " | Cliente: " + cliente.getNome() + " | Espaço: " + espaco.getNome() + " | Total: R$ " + valorTotal;
    }
}