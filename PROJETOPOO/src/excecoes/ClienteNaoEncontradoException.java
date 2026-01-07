package excecoes;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException() {
        super("Erro: Cliente não encontrado no sistema.");
    }
}