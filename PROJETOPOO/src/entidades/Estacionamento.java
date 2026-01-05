package entidades;

public class Estacionamento implements ServicoAdicional {
    private int duracaoHoras;
    private double valorHora;

    public Estacionamento(int duracaoHoras, double valorHora) {
        this.duracaoHoras = duracaoHoras;
        this.valorHora = valorHora;
    }

    @Override
    public String getDescricao() {
        return "Estacionamento (" + duracaoHoras + " horas)";
    }

    @Override
    public double getValorTotal() {
        return duracaoHoras * valorHora;
    }
}