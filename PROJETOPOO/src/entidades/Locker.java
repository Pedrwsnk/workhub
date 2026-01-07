package entidades;

public class Locker implements ServicoAdicional {
    private int quantidade;
    private double valorPorUnidade;

    public Locker(int quantidade, double valorPorUnidade) {
        this.quantidade = quantidade;
        this.valorPorUnidade = valorPorUnidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    @Override
    public String getDescricao() {
        return "Locker (" + quantidade + " unidades)";
    }

    @Override
    public double getValorTotal() {
        return quantidade * valorPorUnidade;
    }
}
