package proyecto_cvs;

public class producto {
	private String nombre;
	private double precio;
	public producto() {
		// TODO Auto-generated constructor stub
	}
	public producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
