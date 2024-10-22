package proyecto_cvs;

public class empleado extends persona{
	private String rol;
	private String identificacion;
	private String h_ingreso;
	private String h_salida;
	private int id_persona;
	public empleado() {
		// TODO Auto-generated constructor stub
	}
	public empleado(String nombre, String apellido, int celular, String rol, String identificacion, String h_ingreso,
			String h_salida) {
		super(nombre, apellido, celular);
		this.rol = rol;
		this.identificacion = identificacion;
		this.h_ingreso = h_ingreso;
		this.h_salida = h_salida;
	}
	
	public empleado(String rol, String identificacion, String h_ingreso, String h_salida, int id_persona) {
		this.rol = rol;
		this.identificacion = identificacion;
		this.h_ingreso = h_ingreso;
		this.h_salida = h_salida;
		this.id_persona = id_persona;
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
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
