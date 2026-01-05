package entidades;

public class CafePremium implements ServicoAdicional {
    private double valor;

    public CafePremium(double valor) {
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return "Café Premium";
    }

    @Override
    public double getValorTotal() {
        return valor;
    }
}