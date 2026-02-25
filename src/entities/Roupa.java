package entities;

import java.time.LocalDate;
import java.time.Month;

import entities.enums.Tamanhos;

public class Roupa extends Produto{
	
	private static final double TAXA_ROUPA = 0.10;
	private static final double DESCONTO_JANEIRO = 0.20;
	private static final double DESCONTO_JULHO = 0.15;
	 
	private Tamanhos tamanho;

	public Roupa(String nome, Integer id, double preco, Tamanhos tamanho) {
		super(nome, id, preco);
		this.tamanho = tamanho;
	}

	public Tamanhos getTamanho() {
		return tamanho;
	}

	@Override
	public double calcularPrecoFinal(LocalDate dataCompra) {
		
		double precoComImposto = getPreco() * (1 + TAXA_ROUPA);
		double precoFinal = precoComImposto;

		if (dataCompra.getMonth() == Month.JANUARY) 
		    precoFinal *= (1 - DESCONTO_JANEIRO);
		else if (dataCompra.getMonth() == Month.JULY) 
		    precoFinal *= (1 - DESCONTO_JULHO);
		
		return precoFinal;
	}
	
}

