package fronteira;

import controle.AdministradorSistema;

public class MenuRelatorios {

    private AdministradorSistema admin;

    public MenuRelatorios(AdministradorSistema admin) {
        this.admin = admin;
    }

    public void exibir() {
        System.out.println("\n--- RELATÓRIOS ADMINISTRATIVOS ---");
        System.out.println("1. Reservas por Cliente");
        System.out.println("2. Faturamento Total");
    }
}