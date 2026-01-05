package entidades;

public class Auditorio extends Espaco {
    public Auditorio(String id, String nome, double valorHora) {
        super(id, nome, valorHora);
    }

    @Override
    public String getTipo() {
        return "Auditório";
    }

    @Override
    public String getDescricaoCompleta() {
        return "Tipo: " + getTipo() + " | ID: " + getId() + " | Nome: " + getNome() + " | Valor/h: " + getValorHora();
    }
}
