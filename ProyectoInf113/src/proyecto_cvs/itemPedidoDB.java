package proyecto_cvs;

import java.sql.*;

public class itemPedidoDB {
	private Connection conexion;

	public itemPedidoDB() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarItemPedido(itemPedido itemPedido) {
		String sql = "INSERT INTO itemspedidos(cantidad, id_producto, id_pedido) VALUES(?, ?, ?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setInt(1, itemPedido.getCantidad());
			parametro.setInt(2, itemPedido.getId_producto());
			parametro.setInt(3, itemPedido.getId_pedido());
			parametro.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarItemPedido(itemPedido itemPedido, int id) {
        String sql = "UPDATE itemspedidos SET cantidad=?, id_producto=?, id_pedido WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setInt(1, itemPedido.getCantidad());
			parametro.setInt(2, itemPedido.getId_producto());
			parametro.setInt(3, itemPedido.getId_pedido());
            parametro.setInt(4, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarItemPedido(int id) {
        String sql = "DELETE FROM itemspedidos WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public itemPedido obtenerItemPedido(int id) {
        String sql = "SELECT * FROM itemspedidos WHERE itemPedido = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new itemPedido(rs.getInt("cantidad"),rs.getInt("id_producto"),rs.getInt("id_pedido"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }	
}

