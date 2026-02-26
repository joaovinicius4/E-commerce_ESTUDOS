package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public List<Produto> getProdutos() {
	    return new ArrayList<>(produtos);
	}
	
	public double calcularTotal(LocalDate dataCompra) {
	    double total = 0;
	    for (Produto p : produtos) 
	        total += p.calcularPrecoFinal(dataCompra);
	    return total;
	}
	
	public void limparCarrinho() {
	    produtos.clear();
	}
	
}
