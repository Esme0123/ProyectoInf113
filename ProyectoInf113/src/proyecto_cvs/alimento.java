package proyecto_cvs;

public class alimento extends inventario{
	private String f_vencimiento;
	private int id_inventario;
	public alimento() {
		// TODO Auto-generated constructor stub
	}
	public alimento(String f_vencimiento, int id_inventario) {
		this.f_vencimiento = f_vencimiento;
		this.id_inventario = id_inventario;
	}
	public alimento(String nom_item, int cantidad_disponible, String f_vencimiento, int id_inventario) {
		super(nom_item, cantidad_disponible);
		this.f_vencimiento = f_vencimiento;
		this.id_inventario = id_inventario;
	}
	public int getId_inventario() {
		return id_inventario;
	}
	public void setId_inventario(int id_inventario) {
		this.id_inventario = id_inventario;
	}
	public String getF_vencimiento() {
		return f_vencimiento;
	}
	public void setF_vencimiento(String f_vencimiento) {
		this.f_vencimiento = f_vencimiento;
	}
	public boolean estaPorVencer() {
        String fechaActual = java.time.LocalDate.now().toString();
        String[] partesFechaActual = fechaActual.split("-");
        String[] partesFechaCaducidad = f_vencimiento.split("-");

        int anioActual = Integer.parseInt(partesFechaActual[0]);
        int mesActual = Integer.parseInt(partesFechaActual[1]);
        int diaActual = Integer.parseInt(partesFechaActual[2]);

        int anioCaducidad = Integer.parseInt(partesFechaCaducidad[0]);
        int mesCaducidad = Integer.parseInt(partesFechaCaducidad[1]);
        int diaCaducidad = Integer.parseInt(partesFechaCaducidad[2]);
        int diferenciaDias = (anioCaducidad - anioActual) * 365 + 
                             (mesCaducidad - mesActual) * 30 + 
                             (diaCaducidad - diaActual);
        return diferenciaDias <= 15;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
