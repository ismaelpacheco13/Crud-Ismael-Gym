
package Modelo;

public class Persona {
  int id;
  String dni;
  String nombre;
  
  public Persona() {
    
  }

  public Persona(int id, String dni, String nombre) {
    this.id = id;
    this.dni = dni;
    this.nombre = nombre;
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
  
}
