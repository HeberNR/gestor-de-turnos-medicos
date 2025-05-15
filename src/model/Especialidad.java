package model;

public class Especialidad {
  private int id;
  private String nombreEspecialidad;
  private static int contadorEsp;

  public Especialidad(String nombre) {
    this.nombreEspecialidad = nombre;
    contadorEsp++;
    this.id = contadorEsp;
  }

  public Especialidad(int id, String nombre) {
    this.nombreEspecialidad = nombre;
    contadorEsp++;
    this.id = contadorEsp;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setNombreEspecialidad(String nombre) {
    this.nombreEspecialidad = nombre;
  }

  public String getNombreEspecialidad() {
    return this.nombreEspecialidad;
  }

  @Override
  public String toString() {
    return "Especialidad {\n"
        + "  id = " + id + ",\n"
        + "  nombre = '" + nombreEspecialidad + "'\n"
        + '}';
  }


}
