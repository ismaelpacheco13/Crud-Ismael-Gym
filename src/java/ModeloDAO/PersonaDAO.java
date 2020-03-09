
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD {
  Conexion cn = new Conexion();
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  Persona p = new Persona();

  @Override
  public List listar() {
    ArrayList<Persona> lista = new ArrayList<>();
    String sql="select * from persona";
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) {
        Persona per = new Persona();
        per.setId(rs.getInt("Id"));
        per.setDni(rs.getString("DNI"));
        per.setNombre(rs.getString("Nombres"));
        lista.add(per);
      }
    } catch (Exception e) {
    }
    return lista;
  }

  @Override
  public Persona listar(int id) {
    String sql="select * from persona where Id="+id;
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) {
        p.setId(rs.getInt("Id"));
        p.setDni(rs.getString("DNI"));
        p.setNombre(rs.getString("Nombres"));
      }
    } catch (Exception e) {
    }
    return p;
  }

  @Override
  public boolean agregar(Persona per) {
    String sql="insert into persona(DNI, Nombres, GimPre) values('"+per.getDni()+"','"+per.getNombre()+"','"+per.getGimPre()+"')";
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      ps.executeUpdate();
    } catch (Exception e) {
    }
    return false;
  }

  @Override
  public boolean editar(Persona per) {
    String sql = "update persona set DNI='"+per.getDni()+"',Nombres='"+per.getNombre()+"', GimPre='"+per.getGimPre()+"' where Id="+per.getId();
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      ps.executeUpdate();
    } catch (Exception e) {
    }
    return false;
  }

  @Override
  public boolean eliminar(int id) {
    String sql = "delete from persona where Id="+id;
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      ps.executeUpdate();
    } catch (Exception e) {
    }
    return false;
  }
  
}
