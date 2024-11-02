package proyecto_cvs;

public class consumible extends inventario{
	private String tipo;
	private int id_inventario;
	public consumible() {
		// TODO Auto-generated constructor stub
	}
	public consumible(String tipo, int id_inventario) {
		this.tipo = tipo;
		this.id_inventario = id_inventario;
	}
	public consumible(String nom_item, int cantidad_disponible, String tipo, int id_inventario) {
		super(nom_item, cantidad_disponible);
		this.tipo = tipo;
		this.id_inventario = id_inventario;
	}
	public int getId_inventario() {
		return id_inventario;
	}
	public void setId_inventario(int id_inventario) {
		this.id_inventario = id_inventario;
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
