package db_clases;

import proyecto_cvs.persona;
import proyecto_cvs.empleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class personaDB {
	private Connection conexion;
	
	public personaDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	//Creación de una nueva propiedad
	public void agregarPersona(empleado prop) {
		String sql="INSERT INTO personas(nombre,apellido,celular) VALUES(?,?,?)";
		try (PreparedStatement parametro=conexion.prepareStatement(sql)){
			parametro.setString(1, prop.getNombre());
			parametro.setString(2, prop.getApellido());
			parametro.setInt(3, prop.getCelular());
			parametro.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarPersona(persona prop, int id) {
        String sql = "UPDATE personas SET nombre=?, apellido=?, celular=? WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setString(1, prop.getNombre());
			parametro.setString(2, prop.getApellido());
			parametro.setInt(3, prop.getCelular());
            parametro.setInt(4, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarPersona(int id) {
        String sql = "DELETE FROM personas WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public persona obtenerPersona(int id) {
        String sql = "SELECT * FROM personas WHERE id_persona = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new persona(rs.getString("nombre"),rs.getString("apellido"), rs.getInt("celular"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
