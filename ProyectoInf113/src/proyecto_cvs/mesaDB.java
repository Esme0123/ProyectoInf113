package proyecto_cvs;

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
        String sql = "UPDATE mesas SET capacidad=?, estado=? WHERE id_mesa = ?";
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
        String sql = "DELETE FROM mesas WHERE id_mesa = ?";
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
    
    public void reservarMesa(int numeroMesa) {
    	String sql = "UPDATE mesas SET estado = 1 WHERE id_mesa = ? AND estado = 0";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, numeroMesa);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("La mesa " + numeroMesa + " ha sido reservada.");
            } else {
                System.out.println("La mesa " + numeroMesa + " ya está reservada o no existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void liberarMesa(int numeroMesa) {
    	String sql = "UPDATE mesas SET estado = 0 WHERE id_mesa = ? AND estado = 1";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, numeroMesa);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("La mesa " + numeroMesa + " ha sido liberada.");
            } else {
                System.out.println("La mesa " + numeroMesa + " ya está libre o no existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void consultarEstadoMesa(int numeroMesa) {
    	String sql = "SELECT estado FROM mesas WHERE id_mesa = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, numeroMesa);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                boolean estado = rs.getBoolean("estado");
                if (estado) {
                    System.out.println("La mesa " + numeroMesa + " está reservada.");
                } else {
                    System.out.println("La mesa " + numeroMesa + " está libre.");
                }
            } else {
                System.out.println("La mesa " + numeroMesa + " no existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
}