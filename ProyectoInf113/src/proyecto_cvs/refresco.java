package proyecto_cvs;

public class refresco extends producto{
	private String tamanio; //pequeño, mediano, grande
	public refresco() {
		// TODO Auto-generated constructor stub
	}
	public refresco(String tamanio) {
		this.tamanio = tamanio;
	}
	public refresco(String nombre, double precio, String tamanio) {
		super(nombre, precio);
		this.tamanio = tamanio;
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
