package proyecto_cvs;

public class pedido {
	private int num_pedido;
	private String fecha;
	private boolean estado;
	private cliente cliente;
	private itemPedido [] listapedidos;
	private double total;
	public pedido() {
		// TODO Auto-generated constructor stub
	}
	public pedido(int num_pedido, String fecha, boolean estado, proyecto_cvs.cliente cliente, itemPedido[] listapedidos,
			double total) {
		this.num_pedido = num_pedido;
		this.fecha = fecha;
		this.estado = estado;
		this.cliente = cliente;
		this.listapedidos = listapedidos;
		this.total = total;
	}

	public int getNum_pedido() {
		return num_pedido;
	}
	public void setNum_pedido(int num_pedido) {
		this.num_pedido = num_pedido;
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
	public cliente getCliente() {
		return cliente;
	}
	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}
	public itemPedido[] getListapedidos() {
		return listapedidos;
	}
	public void setListapedidos(itemPedido[] listapedidos) {
		this.listapedidos = listapedidos;
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
