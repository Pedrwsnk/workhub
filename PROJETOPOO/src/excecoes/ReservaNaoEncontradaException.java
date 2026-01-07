package excecoes;

public class ReservaNaoEncontradaException extends Exception {
    public ReservaNaoEncontradaException() {
        super("Erro: Reserva não localizada.");
    }
}