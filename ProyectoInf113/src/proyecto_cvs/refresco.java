package proyecto_cvs;

public class refresco extends producto{
	private String tamanio; //pequeño, mediano, grande
	private int id_producto;
	public refresco() {
		// TODO Auto-generated constructor stub
	}
	public refresco(String nombre, double precio, String tamanio, int id_producto) {
		super(nombre, precio);
		this.tamanio = tamanio;
		this.id_producto = id_producto;
	}
	public refresco(String tamanio, int id_producto) {
		this.tamanio = tamanio;
		this.id_producto = id_producto;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
