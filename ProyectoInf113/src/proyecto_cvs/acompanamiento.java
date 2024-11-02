package proyecto_cvs;

public class acompanamiento {
	private String nombre;
	private int id_hamburguesa;
	public acompanamiento() {
		// TODO Auto-generated constructor stub
	}
	public acompanamiento(String nombre, int id_hamburguesa) {
		this.nombre = nombre;
		this.id_hamburguesa = id_hamburguesa;
	}
	public int getId_hamburguesa() {
		return id_hamburguesa;
	}
	public void setId_hamburguesa(int id_hamburguesa) {
		this.id_hamburguesa = id_hamburguesa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
