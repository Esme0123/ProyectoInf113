package db_clases;

import proyecto_cvs.refresco;
import java.sql.*;

public class refrescoDB {
	private Connection conexion;

    public refrescoDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarRefresco(refresco refresco) {
        String sql = "INSERT INTO refrescos(tamanio,id_producto) VALUES(?,?)";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setString(1, refresco.getTamanio());
            parametro.setInt(2, refresco.getId_producto());
            parametro.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
  //Edición de propiedad
  	public void editarRefresco(refresco refresco, int id) {
  		String sql = "UPDATE refrescos SET tamanio=?, id_producto=? WHERE id = ?";
	    try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
	      	parametro.setString(1, refresco.getTamanio());
			parametro.setInt(2, refresco.getId_producto());
	        parametro.setInt(3, id);
	        parametro.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
  	
      // Eliminar una propiedad
      public void eliminarRefresco(int id) {
          String sql = "DELETE FROM refrescos WHERE id = ?";
          try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
              parametro.setInt(1, id);
              parametro.executeUpdate();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      
      // Obtener lista de propiedades
      public refresco obtenerRefresco(int id) {
          String sql = "SELECT * FROM refrescos WHERE id_refresco = ?";
          try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
              parametro.setInt(1, id);
              ResultSet rs = parametro.executeQuery();
              if (rs.next()) {
                  return new refresco(rs.getString("tamanio"),rs.getInt("id_producto"));
              }
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return null;
      }
}

