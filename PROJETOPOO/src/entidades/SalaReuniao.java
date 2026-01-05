package entidades;

public class SalaReuniao extends Espaco {
    public SalaReuniao(String id, String nome, double valorHora) {
        super(id, nome, valorHora);
    }

    @Override
    public String getTipo() {
        return "Sala de Reunião";
    }

    @Override
    public String getDescricaoCompleta() {
        return "Tipo: " + getTipo() + " | ID: " + getId() + " | Nome: " + getNome() + " | Valor/h: " + getValorHora();
    }
}
