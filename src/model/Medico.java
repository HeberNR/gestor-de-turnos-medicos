package model;

import java.util.ArrayList;

public class Medico {
  private int id;
  private String nombre;
  private String apellido;
  private String matricula;
  private String telefono;
  private Especialidad especialidad;

  public Medico(ArrayList<Medico> listaMedicos) {

  }

  public Medico(String nombre, String apellido, String matricula) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.matricula = matricula;
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

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
  }

  public Especialidad getEspecialidad() {
    return this.especialidad;
  }

  @Override
  public String toString() {
    String resultado = "Médico: " + nombre + " " + apellido;
    if (matricula != null && !matricula.isEmpty()) {
      resultado += " | Matrícula: " + matricula;
    }
    if (id != 0) {
      resultado = "ID: " + id + " | " + resultado;
    }
    return resultado;
  }



}
