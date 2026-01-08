package fronteira;

import java.util.Scanner;
import entidades.*;
import controle.AdministradorSistema;

public class MenuEspacos {

    private Scanner leitor = new Scanner(System.in);
    private AdministradorSistema admin;

    public MenuEspacos(AdministradorSistema admin) {
        this.admin = admin;
    }

    public void exibir() {
        System.out.println("\n--- CADASTRO DE ESPAÇO ---");
        System.out.println("1. Estação | 2. Sala Privada | 3. Reunião | 4. Auditório");
        int tipo = Integer.parseInt(leitor.nextLine());
        
        System.out.print("ID: "); String id = leitor.nextLine();
        System.out.print("Nome: "); String nome = leitor.nextLine();
        System.out.print("Valor/Hora: "); double valor = Double.parseDouble(leitor.nextLine());

        Espaco espaco = switch (tipo) {
            case 1 -> new EstacaoTrabalho(id, nome, valor, true);
            case 2 -> new SalaPrivada(id, nome, valor, true);
            case 3 -> new SalaReuniao(id, nome, valor, true);
            default -> new Auditorio(id, nome, valor, true);
        };
        
        admin.cadastrarEspaco(espaco);
        System.out.println("Espaço cadastrado!");
    }
}
