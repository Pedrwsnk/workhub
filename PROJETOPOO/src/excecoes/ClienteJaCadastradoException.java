package excecoes;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(String cpf) {
        super("Erro: Cliente com CPF " + cpf + " já está cadastrado.");
    }
}