package proyecto_cvs;

public class hamburguesa extends producto{
	private String termino_coccion;
	private int id_producto;
	public hamburguesa() {
		// TODO Auto-generated constructor stub
	}	
	public hamburguesa(String termino_coccion, int id_producto) {
		this.termino_coccion = termino_coccion;
		this.id_producto = id_producto;
	}
	public hamburguesa(String nombre, double precio, String termino_coccion, int id_producto) {
		super(nombre, precio);
		this.termino_coccion = termino_coccion;
		this.id_producto = id_producto;
	}
	public String getTermino_coccion() {
		return termino_coccion;
	}
	public void setTermino_coccion(String termino_coccion) {
		this.termino_coccion = termino_coccion;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
