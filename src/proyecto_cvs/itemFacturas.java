package proyecto_cvs;

public class itemFacturas {
	private itemPedido item_pedido;
	private factura factura;
	public itemFacturas() {
		// TODO Auto-generated constructor stub
	}
	public itemFacturas(itemPedido item_pedido, proyecto_cvs.factura factura) {
		this.item_pedido = item_pedido;
		this.factura = factura;
	}
	public itemPedido getItem_pedido() {
		return item_pedido;
	}
	public void setItem_pedido(itemPedido item_pedido) {
		this.item_pedido = item_pedido;
	}
	public factura getFactura() {
		return factura;
	}
	public void setFactura(factura factura) {
		this.factura = factura;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
