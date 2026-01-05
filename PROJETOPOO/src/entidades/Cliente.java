package entidades;

import java.io.Serializable;
import java.time.LocalDate;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private final LocalDate dataCadastro;

    public Cliente(String cpf, String nome, String email, String telefone, LocalDate dataCadastro){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataCadastro = LocalDate.now();
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome (){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString(){
        return "Cliente [" +"CPF: "+cpf+", Nome: "+nome+", Email: "+email+", Cadastro: "+dataCadastro+"]";
    } 
}
