package proyecto_cvs;

public class hamburguesa extends producto{
	private double peso_carne;
	private String tipo; //simple, doble, vegana
	private boolean papa;
	private boolean queso;
	private boolean salsa;
	public hamburguesa() {
		// TODO Auto-generated constructor stub
	}
	public hamburguesa(String nombre, double precio, double peso_carne, String tipo, boolean papa, boolean queso,
			boolean salsa) {
		super(nombre, precio);
		this.peso_carne = peso_carne;
		this.tipo = tipo;
		this.papa = papa;
		this.queso = queso;
		this.salsa = salsa;
	}
	public hamburguesa(double peso_carne, String tipo, boolean papa, boolean queso, boolean salsa) {
		this.peso_carne = peso_carne;
		this.tipo = tipo;
		this.papa = papa;
		this.queso = queso;
		this.salsa = salsa;
	}
	public double getPeso_carne() {
		return peso_carne;
	}
	public void setPeso_carne(double peso_carne) {
		this.peso_carne = peso_carne;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isPapa() {
		return papa;
	}
	public void setPapa(boolean papa) {
		this.papa = papa;
	}
	public boolean isQueso() {
		return queso;
	}
	public void setQueso(boolean queso) {
		this.queso = queso;
	}
	public boolean isSalsa() {
		return salsa;
	}
	public void setSalsa(boolean salsa) {
		this.salsa = salsa;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
