package proyecto_cvs;

public class factura {
	private String f_emision;
	private String nit;
	private String nombre;
	private String detalle;
	private double costo_total;
	public factura() {
		// TODO Auto-generated constructor stub
	}
	public factura(String f_emision, String nit, String nombre, String detalle, double costo_total) {
		this.f_emision = f_emision;
		this.nit = nit;
		this.nombre = nombre;
		this.detalle = detalle;
		this.costo_total = costo_total;
	}
	public String getF_emision() {
		return f_emision;
	}
	public void setF_emision(String f_emision) {
		this.f_emision = f_emision;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public double getCosto_total() {
		return costo_total;
	}
	public void setCosto_total(double costo_total) {
		this.costo_total = costo_total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
