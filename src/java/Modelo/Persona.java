
package Modelo;

public class Persona {
  int id;
  String dni;
  String nombre;
  int gimPre;
  
  public Persona() {
    
  }

  public Persona(int id, String dni, String nombre, int gimPre) {
    this.id = id;
    this.dni = dni;
    this.nombre = nombre;
    this.gimPre = gimPre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getGimPre() {
    return gimPre;
  }

  public void setGimPre(int gimPre) {
    this.gimPre = gimPre;
  }
  
}
