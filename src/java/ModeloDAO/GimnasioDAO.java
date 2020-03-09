package ModeloDAO;

import Config.Conexion;
import Modelo.Gimnasio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GimnasioDAO {
  Conexion cn = new Conexion();
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  Gimnasio g = new Gimnasio();

  public List listar() {
    ArrayList<Gimnasio> lista = new ArrayList<>();
    String sql="select * from gimnasio;";
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) {
        Gimnasio gim = new Gimnasio();
        gim.setCodGim(rs.getInt("CodGim"));
        gim.setNomGim(rs.getString("NomGim"));
        gim.setDirGim(rs.getString("DirGim"));
        gim.setHorGim(rs.getString("HorGim"));
        gim.setClaGim(rs.getString("ClaGim"));
        lista.add(gim);
      }
    } catch (Exception e) {
    }
    return lista;
  }

  public Gimnasio listar(int id) {
    String sql="select * from gimnasio where CodGim="+id;
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) {
        g.setCodGim(rs.getInt("CodGim"));
        g.setNomGim(rs.getString("NomGim"));
        g.setDirGim(rs.getString("DirGim"));
        g.setHorGim(rs.getString("HorGim"));
        g.setClaGim(rs.getString("ClaGim"));
      }
    } catch (Exception e) {
    }
    return g;
  }

  public boolean agregar(Gimnasio gim) {
    String sql="insert into gimnasio(NomGim, DirGim, HorGim, ClaGim) values('"+gim.getNomGim()+"','"+gim.getDirGim()+"','"+gim.getHorGim()+"','"+gim.getClaGim()+"')";
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      ps.executeUpdate();
    } catch (Exception e) {
    }
    return false;
  }

  public boolean editar(Gimnasio gim) {
    String sql = "update gimnasio set NomGim='"+gim.getNomGim()+"',DirGim='"+gim.getDirGim()+"', HorGim='"+gim.getHorGim()+"', ClaGim='"+gim.getClaGim()+"' where CodGim="+gim.getCodGim();
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      ps.executeUpdate();
    } catch (Exception e) {
    }
    return false;
  }

  public boolean eliminar(int id) {
    String sql = "delete from gimnasio where CodGim="+id;
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      ps.executeUpdate();
    } catch (Exception e) {
    }
    return false;
  }
  
}
