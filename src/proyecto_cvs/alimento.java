package proyecto_cvs;

public class alimento extends inventario{
	private String f_vencimiento;
	public alimento() {
		// TODO Auto-generated constructor stub
	}
	public alimento(String nom_item, int cantidad_disponible) {
		super(nom_item, cantidad_disponible);
		// TODO Auto-generated constructor stub
	}
	public alimento(String nom_item, int cantidad_disponible, String f_vencimiento) {
		super(nom_item, cantidad_disponible);
		this.f_vencimiento = f_vencimiento;
	}
	public String getF_vencimiento() {
		return f_vencimiento;
	}
	public void setF_vencimiento(String f_vencimiento) {
		this.f_vencimiento = f_vencimiento;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
