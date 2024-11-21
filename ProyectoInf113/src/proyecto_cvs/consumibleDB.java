package proyecto_cvs;

import java.sql.*;

public class consumibleDB {
	private Connection conexion;

	public consumibleDB() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarConsumible(consumible consumible) {
	String sql = "INSERT INTO consumible(tipo, id_inventario) VALUES(?, ?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setString(1, consumible.getTipo());
			parametro.setInt(2, consumible.getId_inventario());
			parametro.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarConsumible(consumible consumible, int id) {
        String sql = "UPDATE consumible SET tipo=?, id_inventario=? WHERE id_consumible = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setString(1, consumible.getTipo());
			parametro.setInt(2, consumible.getId_inventario());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarConsumible(int id) {
        String sql = "DELETE FROM consumible WHERE id_consumible = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public consumible obtenerConsumible(int id) {
        String sql = "SELECT * FROM consumible WHERE id_consumible = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
            	consumible consumible = new consumible(rs.getString("tipo"), rs.getInt("id_inventario"));
            	return consumible;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
