package controle;

import entidades.Reserva;
import java.io.*;
import java.util.*;

public class RepositorioReservas implements Serializable {

    private Map<Integer, Reserva> reservas = new HashMap<>();
    private final String CAMINHO = "reservas.dat";

    public RepositorioReservas() {
        carregarArquivo();
    }

    public void inserir(Reserva r) {
        reservas.put(r.getId(), r);
        salvarArquivo();
    }

    public void remover(int id) {
        reservas.remove(id);
        salvarArquivo();
    }

    public Reserva buscar(int id) {
        return reservas.get(id);
    }

    public List<Reserva> listarTodas() {
        return new ArrayList<>(reservas.values());
    }

    private void salvarArquivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO))) {
            oos.writeObject(reservas);
        } catch (IOException e) {
            System.err.println("Erro ao salvar reservas.");
        }
    }

    @SuppressWarnings("unchecked")
    private void carregarArquivo() {
        File file = new File(CAMINHO);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                reservas = (Map<Integer, Reserva>) ois.readObject();
            } catch (Exception e) {
                reservas = new HashMap<>();
            }
        }
    }
}