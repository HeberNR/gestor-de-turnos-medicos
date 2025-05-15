package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Paciente;

import static service.PacienteService.*;


public class MenuPacientes {

  public static void gestionarPacientes(ArrayList<Paciente> pacientes, Scanner sc) {

    String opcion;
    do {
      System.out.println("---------------------");
      System.out.println("Gestion de pacientes.");
      System.out.println("---------------------\n");
      System.out.println("""            
          1. Agregar paciente.
          2. Buscar paciente.
          3. Editar paciente.
          4. Mostrar paciente.
          5. Eliminar paciente.
          6. Volver.
          """
      );

      System.out.println("Ingrese una opcion: ");
      opcion = sc.nextLine();
      switch (opcion) {
        case "1":
          agregarPaciente(pacientes, sc);
          break;
        case "2":
          buscarPaciente(pacientes, sc);
          break;
        case "3":
          editarPaciente(pacientes, sc);
          break;
        case "4":
          mostrarPacientes(pacientes);
          break;
        case "5":
          eliminarPaciente(pacientes, sc);
          break;
        case "6":
          System.out.println("Volviendo al menú principal... 🔙");
          break;
        default:
          System.out.println("Opción no válida");
      }
    } while (!opcion.equals("6"));
  }
}

