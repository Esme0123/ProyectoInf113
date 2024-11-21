package proyecto_cvs;

import java.sql.*;

public class inventarioDB {
	private Connection conexion;

	public inventarioDB() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarInventario(inventario inventario) {
	String sql = "INSERT INTO inventarios(nom_item, cantidad_disponible) VALUES(?, ?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setString(1, inventario.getNom_item());
			parametro.setInt(2, inventario.getCantidad_disponible());
			parametro.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarInventario(inventario inventario, int id) {
        String sql = "UPDATE inventarios SET nom_item=?, cantidad_disponible=? WHERE id_inventario = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setString(1, inventario.getNom_item());
			parametro.setInt(2, inventario.getCantidad_disponible());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarInventario(int id) {
        String sql = "DELETE FROM inventarios WHERE id_inventario = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public inventario obtenerInventario(int id) {
        String sql = "SELECT * FROM inventarios WHERE id_inventario = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
            	inventario inventario = new inventario(rs.getString("nom_item"), rs.getInt("cantidad_disponible"));
            	return inventario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
