package model;

public class Turno {
  private int id;
  private String fecha;
  private String hora;
  private Paciente paciente;
  private Medico medico;

  public Turno() {

  }

  public Turno(String fecha, String hora, Paciente paciente, Medico medico) {
    this.fecha = fecha;
    this.hora = hora;
    this.paciente = paciente;
    this.medico = medico;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getFecha() {
    return this.fecha;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public String getHora() {
    return this.hora;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Paciente getPaciente() {
    return this.paciente;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  @Override
  public String toString() {
    return "Turno {\n"
        + "  id=" + id + ",\n"
        + "  fecha='" + fecha + "',\n"
        + "  hora='" + hora + "',\n"
        + "  paciente='" + paciente + "',\n"
        + "  medico='" + medico + "'\n"
        + '}';
  }

}
