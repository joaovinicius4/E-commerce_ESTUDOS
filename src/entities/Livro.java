package entities;

import java.time.LocalDate;

public class Livro extends Produto{
	
	public static final double TAXA_LIVRO = 0.1;
	
	private String autor;
	
	public Livro(String nome, Integer id, double preco, String autor) {
		super(nome, id, preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}
	
	@Override
	public double calcularPrecoFinal(LocalDate dataCompra) {
		return getPreco() * (1 + TAXA_LIVRO);
	}

}
