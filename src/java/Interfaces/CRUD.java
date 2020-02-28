
package Interfaces;

import Modelo.Persona;
import java.util.List;

public interface CRUD {
  public List listar();
  public Persona listar(int id);
  public boolean agregar(Persona per);
  public boolean editar(Persona per);
  public boolean eliminar(int id);
}
