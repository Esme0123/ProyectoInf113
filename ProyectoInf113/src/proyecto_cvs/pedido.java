package proyecto_cvs;

public class pedido {
	private String fecha;
	private boolean estado;
	private double total;
	private int id_cliente;
	public pedido() {
		// TODO Auto-generated constructor stub
	}
	public pedido(String fecha, boolean estado, double total, int id_cliente) {
		this.fecha = fecha;
		this.estado = estado;
		this.total = total;
		this.id_cliente = id_cliente;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
