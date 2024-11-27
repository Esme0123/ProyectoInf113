package proyecto_cvs;

import java.sql.*;
public class empleadoDB {
	private Connection conexion;
	
	public empleadoDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	//Creación de una nueva propiedad
	public void agregarEmpleado(empleado prop) {
		String sql="INSERT INTO empleados(rol,name_user,password) VALUES(?,?,?)";
		try (PreparedStatement parametro=conexion.prepareStatement(sql)){
			parametro.setString(1, prop.getRol());
			parametro.setString(2, prop.getName_user());
			parametro.setString(3, prop.getPassword());
			parametro.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	//Edición de propiedad
//	public void editarEmpleado(empleado prop, int id) {
//        String sql = "UPDATE empleados SET rol=?, identificacion=?, h_ingreso=?, h_salida=?, id_persona=? WHERE id = ?";
//        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
//			parametro.setString(1, prop.getRol());
//			parametro.setString(2, prop.getIdentificacion());
//			parametro.setString(3, prop.getH_ingreso());
//			parametro.setString(4, prop.getH_salida());
//			parametro.setInt(5, prop.getId_persona());
//            parametro.setInt(6, id);
//            parametro.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//	
//    // Eliminar una propiedad
//    public void eliminarEmpleado(int id) {
//        String sql = "DELETE FROM empleados WHERE id = ?";
//        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
//            parametro.setInt(1, id);
//            parametro.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    // Obtener lista de propiedades
//    public empleado obtenerEmpleado(int id) {
//        String sql = "SELECT * FROM empleados WHERE id_empleado = ?";
//        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
//            parametro.setInt(1, id);
//            ResultSet rs = parametro.executeQuery();
//            if (rs.next()) {
//                return new empleado(rs.getString("rol"),rs.getString("identificacion"), rs.getString("h_ingreso"),rs.getString("h_salida"),rs.getInt("id_persona"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
	
	  // Busqueda segun Nombre de empleado
	  public empleado buscarEmpleado(String name_user) {
	      String sql = "SELECT * FROM empleados WHERE name_user = ?";
	      try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
	          parametro.setString(1, name_user);
	          ResultSet rs = parametro.executeQuery();
	          if (rs.next()) {
	              return new empleado(rs.getString("rol"), rs.getString("name_user"), rs.getString("password"));
	          }
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }
	      return null;
	  }
}
