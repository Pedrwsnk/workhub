package entidades;

public class EstacaoTrabalho extends Espaco {
    public EstacaoTrabalho(String id, String nome, double valorHora) {
        super(id, nome, valorHora);
    }

    @Override
    public String getTipo() {
        return "Estação de Trabalho";
    }

    @Override
    public String getDescricaoCompleta() {
        return "Tipo: " + getTipo() + " | ID: " + getId() + " | Nome: " + getNome() + " | Valor/h: " + getValorHora();
    }
}
