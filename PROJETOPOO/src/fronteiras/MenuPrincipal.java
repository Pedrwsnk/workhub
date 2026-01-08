package fronteira;

import java.util.Scanner;
import controle.AdministradorSistema;

public class MenuPrincipal {

    private Scanner leitor = new Scanner(System.in);
    private AdministradorSistema admin;

    public MenuPrincipal(AdministradorSistema admin) {
        this.admin = admin;
    }

    public void exibir() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== WORKHUB - MENU PRINCIPAL =====");
            System.out.println("1. Clientes");
            System.out.println("2. Espaços");
            System.out.println("3. Reservas e Serviços");
            System.out.println("4. Relatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            try {
                opcao = Integer.parseInt(leitor.nextLine());
                switch (opcao) {
                    case 1 -> new MenuClientes(admin).exibir();
                    case 2 -> new MenuEspacos(admin).exibir();
                    case 3 -> new MenuReservas(admin).exibir();
                    case 4 -> new MenuRelatorios(admin).exibir();
                }
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida.");
            }
        }
    }
}
