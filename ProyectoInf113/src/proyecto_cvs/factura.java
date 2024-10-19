package proyecto_cvs;

public class factura {
	private int num_factura;
	private String f_emision;
	private double monto_total;
	private pedido pedido;
	private cliente cliente;
	private itemFacturas [] listafacturas;
	public factura() {
		// TODO Auto-generated constructor stub
	}
	public factura(int num_factura, String f_emision, double monto_total, proyecto_cvs.pedido pedido,
			proyecto_cvs.cliente cliente, itemFacturas[] listafacturas) {
		this.num_factura = num_factura;
		this.f_emision = f_emision;
		this.monto_total = monto_total;
		this.pedido = pedido;
		this.cliente = cliente;
		this.listafacturas = listafacturas;
	}
	public int getNum_factura() {
		return num_factura;
	}
	public void setNum_factura(int num_factura) {
		this.num_factura = num_factura;
	}
	public String getF_emision() {
		return f_emision;
	}
	public void setF_emision(String f_emision) {
		this.f_emision = f_emision;
	}
	public double getMonto_total() {
		return monto_total;
	}
	public void setMonto_total(double monto_total) {
		this.monto_total = monto_total;
	}
	public pedido getPedido() {
		return pedido;
	}
	public void setPedido(pedido pedido) {
		this.pedido = pedido;
	}
	public cliente getCliente() {
		return cliente;
	}
	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}
	public itemFacturas[] getListafacturas() {
		return listafacturas;
	}
	public void setListafacturas(itemFacturas[] listafacturas) {
		this.listafacturas = listafacturas;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
