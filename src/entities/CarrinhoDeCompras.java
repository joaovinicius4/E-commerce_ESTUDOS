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
	
	public String gerarRelatorio(LocalDate dataCompra) {
	    StringBuilder sb = new StringBuilder();
	    double total = 0.0;

	    for (Produto p : produtos) {
	        double precoFinal = p.calcularPrecoFinal(dataCompra);
	        total += precoFinal;

	        sb.append(p.getNome())
	          .append(" - R$ ")
	          .append(String.format("%.2f", precoFinal))
	          .append("\n");
	    }

	    sb.append("Total: R$ ")
	      .append(String.format("%.2f", total))
	      .append("\n");

	    return sb.toString();
	}
	
}
