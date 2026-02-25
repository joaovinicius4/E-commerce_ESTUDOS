package entities;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> produtos = new ArrayList<>();
	
	public void adcionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
}
