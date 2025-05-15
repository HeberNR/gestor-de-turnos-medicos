package service;

import model.Especialidad;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecialidadService {
  /*
   * Gestionar especialidades:
   * Agregar ✅
   * Buscar ✅
   * Editar ✅
   * Eliminar✅
   * Mostrar ✅ */

  public static void agregarEspecialidad(ArrayList<Especialidad> especialidades, Scanner sc) {

    System.out.println("---------------------------");
    System.out.println("Asignar nueva especialidad.");
    System.out.println("---------------------------\n");
    System.out.println("Ingrese la especialidad: ");
    String esp = sc.nextLine();
    for (Especialidad e : especialidades) {
      if (e.getNombreEspecialidad().equalsIgnoreCase(esp)) {
        System.out.println("⚠️ Ya existe una especialidad con ese nombre.");
        return;
      }
    }
    Especialidad nuevaEspecialidad = new Especialidad(esp);
    especialidades.add(nuevaEspecialidad);
    System.out.println("✅ Especialidad agregada exitosamente.");
  }

  public static Especialidad buscarEspecialidad(ArrayList<Especialidad> especialidades, Scanner sc) {
    System.out.println("--------------------");
    System.out.println("Buscar especialidad.");
    System.out.println("--------------------\n");

    if (especialidades.isEmpty()) {
      System.out.println("❌ No hay especialidad registrada.");
      return null;
    }

    System.out.println("Ingrese la especialidad a buscar: ");
    String esp = sc.nextLine();

    for (Especialidad e : especialidades) {
      if (e.getNombreEspecialidad().equalsIgnoreCase(esp)) {
        return e;
      }
    }
    return null;
  }

  public static void editarEspecialidad(ArrayList<Especialidad> especialidades, Scanner sc) {
    System.out.println("--------------------");
    System.out.println("Editar especialidad.");
    System.out.println("--------------------\n");

    if (especialidades.isEmpty()) {
      System.out.println("❌ No hay especialidad registrados.");
      return;
    }

    Especialidad especialidad1 = buscarEspecialidad(especialidades, sc);

    if (especialidad1 != null) {
      System.out.println("Ingrese la nueva especialidad: ");
      String especialidadNueva = sc.nextLine();
      especialidad1.setNombreEspecialidad(especialidadNueva);
      System.out.println("✅ Especialidad editada correctamente.");
    } else {
      System.out.println("❌ Especialidad no encontrado.");
    }
  }

  public static void eliminarEspecialidad(ArrayList<Especialidad> especialidades, Scanner sc) {
    System.out.println("--------------------");
    System.out.println("Eliminar especialidad.");
    System.out.println("--------------------\n");

    if (especialidades.isEmpty()) {
      System.out.println("❌ No hay especialidad registrados.");
      return;
    }

    Especialidad especialidad1 = buscarEspecialidad(especialidades, sc);

    if (especialidad1 != null) {
      especialidades.remove(especialidad1);
      System.out.println("✅ Especialidad eliminada correctamente.");
    } else {
      System.out.println("❌ Especialidad no encontrada.");
    }
  }

  public static void mostrarEspecialidades(ArrayList<Especialidad> especialidades) {

    if (especialidades.isEmpty()) {
      System.out.println("❌ No hay especialidad registradas.");
      return;
    }

    System.out.println("📋 Lista de especialidades:");
    for (Especialidad esp : especialidades) {
      System.out.println(esp);
    }
  }
}

