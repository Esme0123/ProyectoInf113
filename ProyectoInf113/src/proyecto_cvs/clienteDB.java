package proyecto_cvs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import proyecto_cvs.cliente;

public class clienteDB {
	private Connection conexion;
	
	public clienteDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	//Creación de una nueva propiedad
	public void agregarCliente(cliente prop) {
		String sql="INSERT INTO clientes(ci,id_persona) VALUES(?,?)";
		try (PreparedStatement parametro=conexion.prepareStatement(sql)){
			parametro.setInt(1, prop.getCi());
			parametro.setInt(2, prop.getId_persona());
			parametro.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarCliente(cliente prop, int id) {
        String sql = "UPDATE clientes SET ci=?, id_persona=? WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setInt(1, prop.getCi());
			parametro.setInt(2, prop.getId_persona());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarCliente(int id) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public cliente obtenerCliente(int id) {
        String sql = "SELECT * FROM clientes WHERE id_cliente = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new cliente(rs.getInt("ci"),rs.getInt("id_persona"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

