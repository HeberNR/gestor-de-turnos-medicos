package controller;

import model.Medico;

import java.util.ArrayList;
import java.util.Scanner;

import static service.MedicoService.*;

public class MenuMedicos {

  public static void gestionarMedicos(ArrayList<Medico> medicos, Scanner sc) {
    String opcion;
    do {
      System.out.println("---------------------");
      System.out.println("Gestion de medicos.");
      System.out.println("---------------------\n");
      System.out.println("""            
          1. Agregar medico.
          2. Buscar medico.
          3. Editar medico.
          4. Mostrar medicos.
          5. Eliminar medico.
          6. Volver.
          """
      );

      System.out.println("Ingrese una opcion: ");
      opcion = sc.nextLine();
      switch (opcion) {
        case "1":
          agregarMedico(medicos, sc);
          break;
        case "2":
          buscarMedico(medicos, sc);
          break;
        case "3":
          editarMedico(medicos, sc);
          break;
        case "4":
          mostrarMedicos(medicos);
          break;
        case "5":
          eliminarMedico(medicos, sc);
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
