package db_clases;

import proyecto_cvs.mesa;
import java.sql.*;

public class mesaDB {
	private Connection conexion;

	public mesaDB() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarMesa(mesa mesa) {
	String sql = "INSERT INTO mesas(capacidad, estado) VALUES(?, ?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setInt(1, mesa.getCapacidad());
			parametro.setBoolean(2, mesa.isEstado());
			parametro.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarMesa(mesa mesa, int id) {
        String sql = "UPDATE mesas SET capacidad=?, estado=? WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setInt(1, mesa.getCapacidad());
			parametro.setBoolean(2, mesa.isEstado());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarMesa(int id) {
        String sql = "DELETE FROM mesas WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public mesa obtenerMesa(int id) {
        String sql = "SELECT * FROM mesas WHERE id_mesa = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
            	mesa mesa = new mesa();
            	mesa.setCapacidad(rs.getInt("capacidad"));
            	mesa.setEstado(rs.getBoolean("estado"));
                return mesa;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
	
}