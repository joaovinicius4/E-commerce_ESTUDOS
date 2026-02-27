package entities;

public class Cliente {

	private String nome;
	private String cpf;
	private CarrinhoDeCompras carrinho;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		carrinho = new CarrinhoDeCompras();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public CarrinhoDeCompras getCarrinho() {
		return carrinho;
	}
	
	public String toString(LocalDate dataCompra) {
	    StringBuilder sb = new StringBuilder();

	    sb.append("Cliente: ")
	      .append(nome)
	      .append("\nCPF: ")
	      .append(cpf)
	      .append("\n\nProdutos:\n");

	    sb.append(carrinho.gerarRelatorio(dataCompra));

	    return sb.toString();
	}
	
}
