package proyecto_cvs;

public class inventario {
	private String nom_item;
	private int cantidad_disponible;
	public inventario() {
		// TODO Auto-generated constructor stub
	}
	public inventario(String nom_item, int cantidad_disponible) {
		this.nom_item = nom_item;
		this.cantidad_disponible = cantidad_disponible;
	}
	public String getNom_item() {
		return nom_item;
	}
	public void setNom_item(String nom_item) {
		this.nom_item = nom_item;
	}
	public int getCantidad_disponible() {
		return cantidad_disponible;
	}
	public void setCantidad_disponible(int cantidad_disponible) {
		this.cantidad_disponible = cantidad_disponible;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
