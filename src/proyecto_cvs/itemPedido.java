package proyecto_cvs;

public class itemPedido {
	private int cantidad;
	private producto producto;
	private pedido pedido;
	public itemPedido() {
		// TODO Auto-generated constructor stub
	}
	public itemPedido(int cantidad, proyecto_cvs.producto producto, proyecto_cvs.pedido pedido) {
		this.cantidad = cantidad;
		this.producto = producto;
		this.pedido = pedido;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public producto getProducto() {
		return producto;
	}
	public void setProducto(producto producto) {
		this.producto = producto;
	}
	public pedido getPedido() {
		return pedido;
	}
	public void setPedido(pedido pedido) {
		this.pedido = pedido;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
