package Main;

import controle.AdministradorSistema;
import fronteira.MenuPrincipal;

public class Main {

    public static void main(String[] args) {
        System.out.println("SISTEMA WORKHUB - Inicializando...");

        try {
            AdministradorSistema admin = new AdministradorSistema();

            MenuPrincipal menu = new MenuPrincipal(admin);

            menu.exibir();

        } catch (Exception e) {
            System.err.println("Erro crítico ao iniciar o sistema: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Sistema WorkHub encerrado com segurança.");
        }
    }
}
