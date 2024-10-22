package proyecto_cvs;

public class hamburguesa extends producto{
	private String tipo; //simple, doble, vegana
	
	public hamburguesa() {
		// TODO Auto-generated constructor stub
	}
	public hamburguesa(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
