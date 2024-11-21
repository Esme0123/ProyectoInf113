package proyecto_cvs;

import java.sql.*;

public class hamburguesaDB {
	private Connection conexion;

	public hamburguesaDB() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarHamburguesa(hamburguesa hamburguesa) {
	String sql = "INSERT INTO hamburguesas(termino_coccion, id_producto) VALUES(?, ?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setString(1, hamburguesa.getTermino_coccion());
			parametro.setInt(2, hamburguesa.getId_producto());
			parametro.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarHamburguesa(hamburguesa hamburguesa, int id) {
        String sql = "UPDATE hamburguesas SET termino_coccion=?, id_producto=? WHERE id_hamburguesa = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setString(1, hamburguesa.getTermino_coccion());
			parametro.setInt(2, hamburguesa.getId_producto());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarHamburguesa(int id) {
        String sql = "DELETE FROM hamburguesas WHERE id_hamburguesa = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public hamburguesa obtenerHamburguesa(int id) {
        String sql = "SELECT * FROM hamburguesas WHERE id_hamburguesa = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
            	hamburguesa hamburguesa = new hamburguesa(rs.getString("termino_coccion"), rs.getInt("id_producto"));
            	return hamburguesa;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
