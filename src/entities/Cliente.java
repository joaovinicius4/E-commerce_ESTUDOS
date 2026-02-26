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
	
}
