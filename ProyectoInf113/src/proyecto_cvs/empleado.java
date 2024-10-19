package proyecto_cvs;

public class empleado {
	private String nombre;
	private String apellido;
	private String rol;
	private String identificacion;
	private int celular;
	private String h_ingreso;
	private String h_salida;
	public empleado() {
		// TODO Auto-generated constructor stub
	}
	public empleado(String nombre, String apellido, String rol, String identificacion, int celular, String h_ingreso,
			String h_salida) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rol = rol;
		this.identificacion = identificacion;
		this.celular = celular;
		this.h_ingreso = h_ingreso;
		this.h_salida = h_salida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
