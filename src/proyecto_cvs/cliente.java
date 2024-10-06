package proyecto_cvs;

public class cliente {
	private String nombre;
	private String apellido;
	private int celular;
	public cliente() {
		// TODO Auto-generated constructor stub
	}
	public cliente(String nombre, String apellido, int celular) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
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
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
