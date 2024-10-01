package proyecto_cvs;

public class hamburguesa extends pedido{
	private double peso_carne;
	private boolean papa;
	private String termino_coccion;
	private String salsas;
	public hamburguesa() {
		// TODO Auto-generated constructor stub
	}
	public hamburguesa(double peso_carne, boolean papa, String termino_coccion, String salsas) {
		this.peso_carne = peso_carne;
		this.papa = papa;
		this.termino_coccion = termino_coccion;
		this.salsas = salsas;
	}
	public double getPeso_carne() {
		return peso_carne;
	}
	public void setPeso_carne(double peso_carne) {
		this.peso_carne = peso_carne;
	}
	public boolean isPapa() {
		return papa;
	}
	public void setPapa(boolean papa) {
		this.papa = papa;
	}
	public String getTermino_coccion() {
		return termino_coccion;
	}
	public void setTermino_coccion(String termino_coccion) {
		this.termino_coccion = termino_coccion;
	}
	public String getSalsas() {
		return salsas;
	}
	public void setSalsas(String salsas) {
		this.salsas = salsas;
	}
	/*public void simple() {
		
	}
	public void doble() {
		
	}
	public void vegana() {
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
