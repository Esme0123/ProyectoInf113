package proyecto_cvs;

import java.sql.*;

public class productoDB {
	private Connection conexion;

	public productoDB() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarProducto(producto producto) {
	String sql = "INSERT INTO productos(nombre, precio) VALUES(?, ?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setString(1, producto.getNombre());
			parametro.setDouble(2, producto.getPrecio());
			parametro.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarProducto(producto producto, int id) {
        String sql = "UPDATE productos SET nombre=?, precio=? WHERE id_producto = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setString(1, producto.getNombre());
			parametro.setDouble(2, producto.getPrecio());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarProducto(int id) {
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public producto obtenerProducto(int id) {
        String sql = "SELECT * FROM productos WHERE id_producto = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
            	producto producto = new producto(rs.getString("nombre"), rs.getDouble("precio"));
            	return producto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
