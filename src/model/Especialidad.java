package model;

public class Especialidad {
  private int id;
  private String nombre;

  public Especialidad(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String toString() {
    return "Especialidad {" +
        "id=" + id +
        ", nombre='" + nombre + '\'' +
        '}';
  }
}
