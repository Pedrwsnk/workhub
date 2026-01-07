package entidades;

public class RecebimentoCorrespondencia implements ServicoAdicional {
    private double valorFixo;

    public RecebimentoCorrespondencia(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    @Override
    public String getDescricao() {
        return "Recebimento de Correspondência";
    }

    @Override
    public double getValorTotal() {
        return valorFixo;
    }
}