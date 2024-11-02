package proyecto_cvs;

public class restaurante {
	private String nombre;
	private String direccion;
	private int id_mesa;
	public restaurante() {
		// TODO Auto-generated constructor stub
	}
	public restaurante(String nombre, String direccion, int id_mesa) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.id_mesa = id_mesa;
	}
	public int getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(int id_mesa) {
		this.id_mesa = id_mesa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
