package model;

import java.util.ArrayList;

public class Paciente {
  private int id;
  private String nombre;
  private String apellido;
  private String dni;
  private String telefono;
  private static int contadorPacientes;

  public Paciente(ArrayList<Paciente> listaPacientes) {

  }

  public Paciente(String nombre, String apellido, String telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
    contadorPacientes++;
    this.id = contadorPacientes;
  }

  public Paciente(int id, String nombre, String apellido,
                  String dni, String telefono) {
    contadorPacientes++;
    this.id = contadorPacientes;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.telefono = telefono;
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

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getDni() {
    return this.dni;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getTelefono() {
    return this.telefono;
  }

  @Override
  public String toString() {
    String resultado = "Paciente: " + nombre + " " + apellido + " | Tel: " + telefono;
    if (dni != null) {
      resultado += " | DNI: " + dni;
    }
    if (id != 0) {
      resultado = "ID: " + id + " | " + resultado;
    }
    return resultado;
  }
}