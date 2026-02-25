package entities;

public class Livro extends Produto{
	
	public static final double TAXA_LIVRO = 0.1;
	
	private String autor;
	
	public Livro(String nome, Integer id, Double preco, String autor) {
		super(nome, id, preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}
	
	@Override
	public double calcularPrecoFinal() {
		return getPreco() * (1 + TAXA_LIVRO);
	}

}
