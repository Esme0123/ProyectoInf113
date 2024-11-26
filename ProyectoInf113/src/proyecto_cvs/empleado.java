package proyecto_cvs;

public class empleado extends persona{
	private String rol;
	private String name_user;
	private String h_ingreso;
	private String h_salida;
	private String password;
	
	public empleado() {
		// TODO Auto-generated constructor stub
	}
	public empleado(String nombre, String apellido, int celular, String rol, String name_user, String h_ingreso,
			String h_salida, String password) {
		super(nombre, apellido, celular);
		this.rol = rol;
		this.name_user = name_user;
		this.h_ingreso = h_ingreso;
		this.h_salida = h_salida;
		this.password = password;
	}
	
	public empleado(String rol, String name_user, String h_ingreso, String h_salida, String password) {
		this.rol = rol;
		this.name_user = name_user;
		this.h_ingreso = h_ingreso;
		this.h_salida = h_salida;
		this.password = password;
	}
	
	public empleado(String rol, String name_user, String password) {
		this.rol = rol;
		this.name_user = name_user;
		this.password = password;
	}
	
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getName_user() {
		return name_user;
	}
	public void setName_user(String name_user) {
		this.name_user = name_user;
	}
	public String getH_ingreso() {
		return h_ingreso;
	}
	public void setH_ingreso(String h_ingreso) {
		this.h_ingreso = h_ingreso;
	}
	public String getH_salida() {
		return h_salida;
	}
	public void setH_salida(String h_salida) {
		this.h_salida = h_salida;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean verificarPassword(char[] passw) {
		if(this.password.equals(new String(passw))) {
			return true;
		}
		return false;
	}
	
}
