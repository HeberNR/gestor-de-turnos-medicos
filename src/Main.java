
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

import model.Especialidad;
import model.Medico;
import model.Paciente;

import static controller.MenuPacientes.gestionarPacientes;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static final Logger LOG =
      Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    /*
     * Necesito regitrar pacientes con nombre y apellido
     * Tener 2 o 3 especialidades de doctores
     * el usuario puede acceder a las especialidades/doctores y verlos en pantalla
     * el paciente debe poder elegir que especialidad elegir para acceder al turno
     * mostrar una serie de fechas disponibles y poder seleccionar
     * v1 de la consola, unicamente simula ser un usuario
     * */

    Scanner sc = new Scanner(System.in);
    ArrayList<Paciente> listaPacientes = new ArrayList<>();
    ArrayList<Especialidad> listaEspecialidades = new ArrayList<>();
    ArrayList<Medico> listaMedicos = new ArrayList<>();
    String opcion;

    do {
      System.out.println("=============================");
      System.out.println("Sistema de gestion de turnos.");
      System.out.println("=============================\n");
      System.out.println("""            
          1. Gestion de pacientes.
          2. Gestion de medicos.
          3. Asignar nuevo turno.
          4. Listar turnos.
          5. Listar pacientes.
          6. Listar medicos.
          7. Modificar turnos.
          8. Cancelar turnos.
          9. Salir.
          """
      );
      System.out.println("Ingrese una opcion: ");
      opcion = sc.nextLine();
      switch (opcion) {
        case "1":
          gestionarPacientes(listaPacientes, sc);
          break;
        case "2":
          System.out.println("Funcionalidad en desarrollo ⏳");
          break;
        case "3":
          System.out.println("Funcionalidad en desarrollo ⏳");
          break;
        case "4":
          System.out.println("Funcionalidad en desarrollo ⏳");
          break;
        case "5":
          System.out.println("Funcionalidad en desarrollo ⏳");
          break;
        case "6":
          System.out.println("Funcionalidad en desarrollo ⏳");
          break;
        case "7":
          System.out.println("Funcionalidad en desarrollo ⏳");
          break;
        case "8":
          System.out.println("Funcionalidad en desarrollo ⏳");
          break;
        case "9":
          System.out.println("Saliendo del sistema...\uD83D\uDC4B");
          break;
        default:
          System.out.println("Opción no válida");
      }
    } while (!opcion.equalsIgnoreCase("9"));

  }
}
