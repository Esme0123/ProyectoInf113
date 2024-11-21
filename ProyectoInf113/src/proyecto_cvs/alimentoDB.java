package proyecto_cvs;

import java.sql.*;

public class alimentoDB {
	private Connection conexion;

	public alimentoDB() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarAlimento(alimento alimento) {
	String sql = "INSERT INTO alimentos(f_vencimiento, id_inventario) VALUES(?, ?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
			parametro.setString(1, alimento.getF_vencimiento());
			parametro.setInt(2, alimento.getId_inventario());
			parametro.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarAlimento(alimento alimento, int id) {
        String sql = "UPDATE alimentos SET f_vencimiento=?, id_inventario=? WHERE id_alimento = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
        	parametro.setString(1, alimento.getF_vencimiento());
			parametro.setInt(2, alimento.getId_inventario());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarAlimento(int id) {
        String sql = "DELETE FROM alimentos WHERE id_alimento = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public alimento obtenerAlimento(int id) {
        String sql = "SELECT * FROM alimentos WHERE id_alimento = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
            	alimento alimento = new alimento(rs.getString("f_vencimiento"), rs.getInt("id_inventario"));
            	return alimento;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
