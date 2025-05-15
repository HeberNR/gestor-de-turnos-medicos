package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Paciente;


public class PacienteService {
  /*
   * Gestionar Pacientes:
   * Agregar ✅
   * Buscar ✅
   * Editar ✅
   * Eliminar✅
   * Mostrar ✅ */

  public static void agregarPaciente(ArrayList<Paciente> pacientes, Scanner sc) {
    System.out.println("-----------------------");
    System.out.println("Asignar nuevo paciente.");
    System.out.println("-----------------------\n");
    System.out.println("Ingrese el nombre del paciente:");
    String nombreP = sc.nextLine();
    System.out.println("Ingrese el apellido del paciente:");
    String apellidoP = sc.nextLine();
    System.out.println("Ingrese el numero de contacto del paciente: ");
    String numTel = sc.nextLine();
    Paciente nuevoPaciente = new Paciente(nombreP, apellidoP, numTel);
    pacientes.add(nuevoPaciente);
    System.out.println("✅ Paciente agregado exitosamente.");
  }

  public static Paciente buscarPaciente(ArrayList<Paciente> pacientes, Scanner sc) {
    System.out.println("----------------");
    System.out.println("Buscar paciente.");
    System.out.println("----------------\n");

    if (pacientes.isEmpty()) {
      System.out.println("❌ No hay pacientes registrados.");
      return null;
    }

    System.out.println("Ingrese el nombre del paciente a buscar: ");
    String nombre = sc.nextLine();

    for (Paciente p : pacientes) {
      if (p.getNombre().equalsIgnoreCase(nombre)) {
        return p;
      }
    }
    return null;
  }

  public static void editarPaciente(ArrayList<Paciente> pacientes, Scanner sc) {
    System.out.println("--------------------------");
    System.out.println("Editar datos del paciente.");
    System.out.println("--------------------------\n");

    if (pacientes.isEmpty()) {
      System.out.println("❌ No hay pacientes registrados.");
      return;
    }

    Paciente paciente = buscarPaciente(pacientes, sc);

    if (paciente != null) {
      System.out.println("Ingrese el nuevo nombre: ");
      String nuevoNombre = sc.nextLine();
      System.out.println("Ingrese el nuevo apellido: ");
      String nuevoApellido = sc.nextLine();
      System.out.println("Ingrese el nuevo número de teléfono: ");
      String nuevoTelefono = sc.nextLine();

      paciente.setNombre(nuevoNombre);
      paciente.setApellido(nuevoApellido);
      paciente.setTelefono(nuevoTelefono);

      System.out.println("✅ Paciente editado correctamente.");
    } else {
      System.out.println("❌ Paciente no encontrado.");
    }
  }

  public static void eliminarPaciente(ArrayList<Paciente> pacientes, Scanner sc) {
    System.out.println("----------------------------");
    System.out.println("Eliminar datos del paciente.");
    System.out.println("----------------------------\n");

    if (pacientes.isEmpty()) {
      System.out.println("❌ No hay pacientes registrados.");
      return;
    }

    Paciente paciente = buscarPaciente(pacientes, sc);

    if (paciente != null) {
      pacientes.remove(paciente);
      System.out.println("✅ Paciente eliminado de la lista.");
    } else {
      System.out.println("❌ Paciente no encontrado en la lista.");
    }
  }

  public static void mostrarPacientes(ArrayList<Paciente> pacientes) {
    if (pacientes.isEmpty()) {
      System.out.println("❌ No hay pacientes registrados.");
      return;
    }

    System.out.println("📋 Lista de pacientes:");
    for (Paciente paciente : pacientes) {
      System.out.println(paciente);
    }
  }

}
