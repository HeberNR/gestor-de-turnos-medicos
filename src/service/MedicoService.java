package service;

import model.Medico;
import model.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicoService {
  /*
   * Funciones de medico:
   * 1. Agregar✅
   * 2. Buscar✅
   * 3. Editar✅
   * 4. Eliminar✅
   * 5. Mostrar
   * */

  public static void agregarMedico(ArrayList<Medico> medicos, Scanner sc) {

    System.out.println("-----------------------");
    System.out.println("Asignar nuevo medico.");
    System.out.println("-----------------------\n");

    System.out.println("Por favor ingrese el nombre del medico: ");
    String nombre = sc.nextLine();
    System.out.println("Por favor ingrese el apellido del medico: ");
    String apellido = sc.nextLine();
    System.out.println("Por favor ingrese la matricula del medico: ");
    String matricula = sc.nextLine();

    Medico nuevoMedico = new Medico(nombre, apellido, matricula);
    medicos.add(nuevoMedico);
    System.out.println("✅ Medico agregado exitosamente.");
  }

  public static Medico buscarMedico(ArrayList<Medico> medicos, Scanner sc) {
    System.out.println("----------------");
    System.out.println("Buscar medico.");
    System.out.println("----------------\n");

    if (medicos.isEmpty()) {
      System.out.println("❌ No hay medicos registrados.");
      return null;
    }

    System.out.println("Ingrese el nombre del medico a buscar: ");
    String nombre = sc.nextLine();

    for (Medico m : medicos) {
      if (m.getNombre().equalsIgnoreCase(nombre)) {
        return m;
      }
    }
    return null;
  }

  public static void editarMedico(ArrayList<Medico> medicos, Scanner sc) {
    System.out.println("--------------------------");
    System.out.println("Editar datos del medico.");
    System.out.println("--------------------------\n");

    if (medicos.isEmpty()) {
      System.out.println("❌ No hay medicos registrados.");
      return;
    }

    Medico medico = buscarMedico(medicos, sc);

    if (medico != null) {
      System.out.println("Ingrese el nuevo nombre: ");
      String nuevoNombre = sc.nextLine();
      System.out.println("Ingrese el nuevo apellido: ");
      String nuevoApellido = sc.nextLine();
      System.out.println("Ingrese la nueva matricula: ");
      String nuevaMatricula = sc.nextLine();

      medico.setNombre(nuevoNombre);
      medico.setApellido(nuevoApellido);
      medico.setTelefono(nuevaMatricula);

      System.out.println("✅ Medico editado correctamente.");
    } else {
      System.out.println("❌ Medico no encontrado.");
    }
  }

  public static void eliminarMedico(ArrayList<Medico> medicos, Scanner sc) {
    System.out.println("----------------------------");
    System.out.println("Eliminar datos del medico.");
    System.out.println("----------------------------\n");

    if (medicos.isEmpty()) {
      System.out.println("❌ No hay medicos registrados.");
      return;
    }

    Medico medico = buscarMedico(medicos, sc);

    if (medico != null) {
      medicos.remove(medico);
      System.out.println("✅ Medico eliminado de la lista.");
    } else {
      System.out.println("❌ Medico no encontrado en la lista.");
    }
  }

  public static void mostrarMedicos(ArrayList<Medico> medicos) {
    if (medicos.isEmpty()) {
      System.out.println("❌ No hay medicos registrados.");
      return;
    }

    System.out.println("📋 Lista de medicos:");
    for (Medico medico : medicos) {
      System.out.println(medico);
    }
  }
}
