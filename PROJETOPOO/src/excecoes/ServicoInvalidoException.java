package excecoes;

public class ServicoInvalidoException extends Exception {
    public ServicoInvalidoException(String msg) {
        super("Erro no serviço: " + msg);
    }
}