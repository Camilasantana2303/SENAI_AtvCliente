package model;

import java.util.Date;

public class Pedido {
	private int idPedido;
	private int quantidade;
	private Cliente cliente;
	private Produto produto;
	private Date data;
	
	
	public Pedido(int idPedido,Cliente cliente,int quantidade,Produto produto,Date data) {
		this.ciarPedido(idPedido,cliente,produto,quantidade,data);
	}
	
	public Pedido(int idPedido,int quantidade,Cliente cliente,Produto produto,Date data) {
		this.idPedido=idPedido;
		this.quantidade=quantidade;
		this.cliente=cliente;
		this.produto=produto;
		this.data=data;
	}
	

	public int getidPedido() {
		return idPedido;
	}
	public void setidPedido(int pedido) {
		this.idPedido = pedido;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	public void ciarPedido(int idPedido,Cliente cliente,Produto produto,int quantidade,Date data) {
		this.idPedido=idPedido;
		this.quantidade=quantidade;
		this.cliente=cliente;
		this.produto=produto;
		this.data=data;
	}
	
	public void exibirPedido(Pedido pedido) {
		System.out.println(pedido.getidPedido());
		System.out.println(pedido.getQuantidade());
		System.out.println(pedido.getCliente().getNome());
		System.out.println(pedido.getProduto().getNome());
		System.out.println(pedido.getQuantidade());
		System.out.println(pedido.data);
	}
	


	


	@Override
	public String toString() {
		return "Pedido [pedido=" + idPedido + ", quantidade=" + quantidade + ", cliente=" + cliente
				+ ", produto=" + produto + ", data=" + data;
	}

	
	
	
	
	
	

}
