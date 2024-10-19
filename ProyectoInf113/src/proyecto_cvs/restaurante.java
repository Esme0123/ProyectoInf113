package proyecto_cvs;

public class restaurante {
	private String nombre;
	private String direccion;
	private mesa [] lista_mesa;
	public restaurante() {
		// TODO Auto-generated constructor stub
	}
	public restaurante(String nombre, String direccion, mesa[] lista_mesa) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.lista_mesa = lista_mesa;
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
	public mesa[] getLista_mesa() {
		return lista_mesa;
	}
	public void setLista_mesa(mesa[] lista_mesa) {
		this.lista_mesa = lista_mesa;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
