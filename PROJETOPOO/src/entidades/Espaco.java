package entidades;

import java.io.Serializable;

public abstract class Espaco implements Serializable {
    private String id;
    private String nome;
    private double valorHora;
    private boolean disponivel;

    public Espaco(String id, String nome, double valorHora) {
        this.id = id;
        this.nome = nome;
        this.valorHora = valorHora;
        this.disponivel = true; // Espaços começam disponíveis por padrão
    }

    // Getters e Setters para garantir o encapsulamento
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public abstract String getTipo();
    public abstract String getDescricaoCompleta();
}