package db_clases;

import proyecto_cvs.restaurante;
import java.sql.*;

public class restauranteDB {

	private Connection conexion;

	public restauranteDB() {
	   try {
	       conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
	   } catch (Exception e) {
	       e.printStackTrace();
	   }
	}

	public void agregarRestaurante(restaurante restaurante) {
	   String sql = "INSERT INTO restaurantes(nombre,direccion,id_mesa) VALUES(?,?,?)";
	   try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
	       parametro.setString(1, restaurante.getNombre());
	       parametro.setString(2, restaurante.getDireccion());
	       parametro.setInt(3, restaurante.getId_mesa());
	       parametro.executeUpdate();
	   } catch (Exception e) {
	       e.printStackTrace();
	   }
	}
	
	//Edición de propiedad
	public void editarRestaurante(restaurante restaurante, int id) {
        String sql = "UPDATE restaurantes SET nombre=?, direccion=?, id_mesa=? WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setString(1, restaurante.getNombre());
			parametro.setString(2, restaurante.getDireccion());
			parametro.setInt(3, restaurante.getId_mesa());
            parametro.setInt(4, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarRestaurante(int id) {
        String sql = "DELETE FROM restaurantes WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public restaurante obtenerRestaurante(int id) {
        String sql = "SELECT * FROM restaurantes WHERE id_restaurante = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new restaurante(rs.getString("nombre"),rs.getString("direccion"), rs.getInt("id_mesa"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
	
}