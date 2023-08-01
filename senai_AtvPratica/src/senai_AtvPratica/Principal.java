package senai_AtvPratica;

import java.util.Date;

import controller.ClienteController;
import controller.PedidoController;
import controller.ProdutoController;
import model.Cliente;
import model.Pedido;
import model.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		//Produto Controller	
		
		ProdutoController produtoController= new ProdutoController();
		Produto produto = produtoController.criarProduto(2, "nome", 4);
		produtoController.exibirDetalhes(produto);
		
				
		
		//cliente controller
		ClienteController clienteController = new ClienteController();
		Cliente cliente =clienteController.criarCliente(2, "nome", "email");
		clienteController.exibirDetalhes(cliente);
		
		
		//pedido controller
		PedidoController pedidoController = new PedidoController();
		Pedido pedido = pedidoController.criarPedido(1,cliente,produto,2,data);
		pedidoController.exibirDetalhesPedido(pedido);
		
		
		
		
		
		
	}

}
