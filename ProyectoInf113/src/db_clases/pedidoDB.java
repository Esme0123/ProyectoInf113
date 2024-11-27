package db_clases;

import proyecto_cvs.pedido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pedidoDB {
	private Connection conexion;
	
	public pedidoDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	//Creación de una nueva propiedad
	public void agregarPedido(pedido prop) {
		String sql="INSERT INTO pedidos(fecha,estado,total,id_cliente) VALUES(?,?,?,?)";
		try (PreparedStatement parametro=conexion.prepareStatement(sql)){
			parametro.setString(1, prop.getFecha());
			parametro.setBoolean(2, prop.isEstado());
			parametro.setDouble(3, prop.getTotal());
			parametro.setInt(4, prop.getId_cliente());
			parametro.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarPedido(pedido prop, int id) {
        String sql = "UPDATE pedidos SET fecha=?, estado=?, total=?, id_cliente=? WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setString(1, prop.getFecha());
			parametro.setBoolean(2, prop.isEstado());
			parametro.setDouble(3, prop.getTotal());
			parametro.setInt(4, prop.getId_cliente());
            parametro.setInt(5, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarPedido(int id) {
        String sql = "DELETE FROM pedidos WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public pedido obtenerPedido(int id) {
        String sql = "SELECT * FROM pedidos WHERE id_pedido = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new pedido(rs.getString("fecha"),rs.getBoolean("estado"),rs.getDouble("total"),rs.getInt("id_cliente"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}