package proyecto_cvs;

public class cliente {
	private String nombre;
	private int ci;
	private int celular;
	private String correo;
	public cliente() {
		// TODO Auto-generated constructor stub
	}
	public cliente(String nombre, int ci, int celular, String correo) {
		this.nombre = nombre;
		this.ci = ci;
		this.celular = celular;
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
