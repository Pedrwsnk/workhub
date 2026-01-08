package controle;

import entidades.Espaco;
import java.io.*;
import java.util.*;

public class RepositorioEspacos implements Serializable {

        private Map<String, Espaco> espacos = new HashMap<>();
    private final String CAMINHO = "espacos.dat";

    public RepositorioEspacos() {
        carregarArquivo();
    }

    public void inserir(Espaco e) {
        espacos.put(e.getId(), e);
        salvarArquivo();
    }

    public Espaco buscar(String id) {
        return espacos.get(id);
    }

    public List<Espaco> listarTodos() {
        return new ArrayList<>(espacos.values());
    }

    private void salvarArquivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO))) {
            oos.writeObject(espacos);
        } catch (IOException e) {
            System.err.println("Erro ao salvar espaços.");
        }
    }

    @SuppressWarnings("unchecked")
    private void carregarArquivo() {
        File file = new File(CAMINHO);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                espacos = (Map<String, Espaco>) ois.readObject();
            } catch (Exception e) {
                espacos = new HashMap<>();
            }
        }
    }
}
