package entities;

public abstract class Produto {
	
	private String nome;
	private Integer id;
	private double preco;
	
	public Produto(String nome, Integer id, Double preco) {
		this.nome = nome;
		this.id = id;
		this.preco = preco;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public Double getPreco() {
		return preco;
	}

	public abstract double calcularPrecoFinal();
	
}
