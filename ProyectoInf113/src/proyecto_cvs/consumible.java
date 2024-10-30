package proyecto_cvs;

public class consumible extends alimento{
	private String tipo;
	
	public consumible() {
		// TODO Auto-generated constructor stub
	}

	public consumible(String nom_item, int cantidad_disponible, String f_vencimiento) {
		super(nom_item, cantidad_disponible, f_vencimiento);
		// TODO Auto-generated constructor stub
	}

	public consumible(String nom_item, int cantidad_disponible) {
		super(nom_item, cantidad_disponible);
		// TODO Auto-generated constructor stub
	}

	public consumible(String nom_item, int cantidad_disponible, String f_vencimiento, String tipo) {
		super(nom_item, cantidad_disponible, f_vencimiento);
		this.tipo = tipo;
	}

	public consumible(String tipo) {
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
