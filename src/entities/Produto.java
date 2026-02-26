package entities;

import java.time.LocalDate;

public abstract class Produto {
	
	private String nome;
	private Integer id;
	private double preco;
	
	public Produto(String nome, Integer id, double preco) {
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

	public double getPreco() {
		return preco;
	}

	public abstract double calcularPrecoFinal(LocalDate dataCompra);

	@Override
	public String toString() {
	    return nome + " (ID: " + id + ") - R$ " + String.format("%.2f", preco);
	}
}
