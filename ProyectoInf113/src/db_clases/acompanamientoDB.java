package db_clases;

import proyecto_cvs.acompanamiento;
import java.sql.*;

public class acompanamientoDB {
	private Connection conexion;

    public acompanamientoDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarAcompanamiento(acompanamiento acompanamiento) {
        String sql = "INSERT INTO acompanamientos(nombre,id_hamburguesa) VALUES(?,?)";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setString(1, acompanamiento.getNombre());
            parametro.setInt(2, acompanamiento.getId_hamburguesa());
            parametro.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Edición de propiedad
  	public void editarAcompanamiento(acompanamiento acompanamiento, int id) {
  		String sql = "UPDATE acompanamientos SET nombre=?, id_hamburguesa=? WHERE id = ?";
  		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
  			parametro.setString(1, acompanamiento.getNombre());
  			parametro.setInt(2, acompanamiento.getId_hamburguesa());
  			parametro.setInt(3, id);
  			parametro.executeUpdate();
  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
    }
  	
  	// Eliminar una propiedad
    public void eliminarAcompanamiento(int id) {
        String sql = "DELETE FROM acompanamientos WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public acompanamiento obtenerAcompanamiento(int id) {
        String sql = "SELECT * FROM acompanamientos WHERE id_cliente = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new acompanamiento(rs.getString("nombre"),rs.getInt("id_hamburguesa"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}


