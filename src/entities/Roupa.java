package entities;

import java.time.LocalDate;

public class Roupa extends Produto{

	private Integer tamanho;

	public Roupa(String nome, Integer id, double preco, Integer tamanho) {
		super(nome, id, preco);
		this.tamanho = tamanho;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	@Override
	public double calcularPrecoFinal(LocalDate dataCompra) {
		return 0;
	}
	
	
}

