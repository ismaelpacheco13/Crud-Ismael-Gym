package ModeloDAO;

import Modelo.Gimnasio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GimnasioDAO {

  String databaseURL = "jdbc:mysql://localhost:3306/ismaelgym";
  String user = "root";
  String password = "";

  public List<Gimnasio> list() throws SQLException {
    List<Gimnasio> listGimnasio = new ArrayList<>();

    try (Connection connection = DriverManager.getConnection(databaseURL, user, password)) {
      String sql = "SELECT * FROM gimnasio ORDER BY name";
      Statement statement = connection.createStatement();
      ResultSet result = statement.executeQuery(sql);

      while (result.next()) {
        int id = result.getInt("CodGim");
        String name = result.getString("NomGim");
        Gimnasio gimnasio = new Gimnasio(id, name);

        listGimnasio.add(gimnasio);
      }

    } catch (SQLException ex) {
      ex.printStackTrace();
      throw ex;
    }

    return listGimnasio;
  }
}
