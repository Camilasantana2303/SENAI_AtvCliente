package view;

import model.Pedido;

public class PedidoView {
	
	public void exibirPedido(Pedido pedido) {
		System.out.println(pedido.getidPedido());
		System.out.println(pedido.getQuantidade());
		System.out.println(pedido.getCliente());
		System.out.println(pedido.getProduto());
		System.out.println(pedido.getData());
	}

}
