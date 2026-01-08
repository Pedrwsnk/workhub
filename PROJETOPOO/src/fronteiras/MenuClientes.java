package fronteira;

import java.util.Scanner;
import entidades.Cliente;
import controle.AdministradorSistema;
import excecoes.ClienteJaCadastradoException;
import java.time.LocalDate;

public class MenuClientes {

    private Scanner leitor = new Scanner(System.in);
    private AdministradorSistema admin;

    public MenuClientes(AdministradorSistema admin) {
        this.admin = admin;
    }

    public void exibir() {
        System.out.println("\n--- CADASTRO DE CLIENTE ---");
        System.out.print("CPF: "); String cpf = leitor.nextLine();
        System.out.print("Nome: "); String nome = leitor.nextLine();
        System.out.print("Email: "); String email = leitor.nextLine();
        System.out.print("Telefone: "); String tel = leitor.nextLine();

        try {
            admin.cadastrarCliente(new Cliente(cpf, nome, email, tel, LocalDate.now()));
            System.out.println("Sucesso!");
        } catch (ClienteJaCadastradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
