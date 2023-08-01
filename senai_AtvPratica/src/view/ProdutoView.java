package view;


import model.Produto;

public class ProdutoView {
	public void exibirProduto(Produto produto) {
		System.out.println(produto.getIdProduto());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
	}

}
