package excecoes;

public class EspacoIndisponivelException extends Exception {
    public EspacoIndisponivelException() {
        super("Erro: O espaço solicitado não está disponível para este horário.");
    }
}