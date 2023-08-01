package view;

import model.Cliente;


public class ClienteView {
	public void exibirCliente(Cliente cliente ) {
		System.out.println(cliente.getIdCliente());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEmail());
	}

}
