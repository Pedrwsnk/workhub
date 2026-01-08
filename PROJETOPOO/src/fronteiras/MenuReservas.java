package fronteira;

import java.util.Scanner;
import controle.AdministradorSistema;
import entidades.*;
import java.time.*;

public class MenuReservas {

    private Scanner leitor = new Scanner(System.in);
    private AdministradorSistema admin;

    public MenuReservas(AdministradorSistema admin) {
        this.admin = admin;
    }

    public void exibir() {
        try {
            System.out.print("CPF do Cliente: "); String cpf = leitor.nextLine();
            System.out.print("ID do Espaço: "); String idEspaco = leitor.nextLine();
            System.out.print("Data (AAAA-MM-DD): "); LocalDate data = LocalDate.parse(leitor.nextLine());
            System.out.print("Início (HH:MM): "); LocalTime inicio = LocalTime.parse(leitor.nextLine());
            System.out.print("Fim (HH:MM): "); LocalTime fim = LocalTime.parse(leitor.nextLine());

            // A lógica de criar o objeto Reserva e enviar ao admin.realizarReserva()
            // Trate aqui as exceções de EspacoIndisponivel e ClienteNaoEncontrado
            System.out.println("Reserva concluída!");
        } catch (Exception e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
    }
}
