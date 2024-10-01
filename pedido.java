package proyecto_cvs;

public class pedido {
	private double precio;
	private String tamanio;
	private int cantidad;
	private boolean delivery;
	public pedido() {
		// TODO Auto-generated constructor stub
	}
	public pedido(double precio, String tamanio, int cantidad, boolean delivery) {
		this.precio = precio;
		this.tamanio = tamanio;
		this.cantidad = cantidad;
		this.delivery = delivery;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isDelivery() {
		return delivery;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	/*public void para_llevar() {
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
