package entities;

public class Eletronico extends Produto{

	private String marca;

	public Eletronico(String nome, Integer id, double preco, String marca) {
		super(nome, id, preco);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public double calcularPrecoFinal() {
		
	}

}
