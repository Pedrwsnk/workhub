package entidades;

public class SalaPrivada extends Espaco {
    public SalaPrivada(String id, String nome, double valorHora) {
        super(id, nome, valorHora);
    }

    @Override
    public String getTipo() {
        return "Sala Privada";
    }

    @Override
    public String getDescricaoCompleta() {
        return "Tipo: " + getTipo() + " | ID: " + getId() + " | Nome: " + getNome() + " | Valor/h: " + getValorHora();
    }
}
