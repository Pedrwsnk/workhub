package controle;

import entidades.Cliente;
import excecoes.FalhaPersistenciaException;
import java.io.*;
import java.util.*;

public class RepositorioClientes implements Serializable{

    private Map<String, Cliente> clientes = new HashMap<>();
    private final String CAMINHO = "clientes.dat";

    public RepositorioClientes() {
        carregarArquivo();
    }

    public void inserir(Cliente c) {
        clientes.put(c.getCpf(), c);
        salvarArquivo();
    }

    public Cliente buscar(String cpf) {
        return clientes.get(cpf);
    }

    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes.values());
    }

    private void salvarArquivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.err.println("Erro ao salvar clientes.");
        }
    }

    @SuppressWarnings("unchecked")
    private void carregarArquivo() {
        File file = new File(CAMINHO);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                clientes = (Map<String, Cliente>) ois.readObject();
                clientes = new HashMap<>();
            }
        }
    }
}

