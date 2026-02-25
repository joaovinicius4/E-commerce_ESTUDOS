package entities;

import java.time.LocalDate;
import java.time.Month;

public class Eletronico extends Produto{
	
	private static final double TAXA_ELETRONICO = 0.20;
	private static final double COMPRA_NOVEMBRO = 0.15;
	
	private String marca;

	public Eletronico(String nome, Integer id, double preco, String marca) {
		super(nome, id, preco);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public double calcularPrecoFinal(LocalDate dataCompra) {
	
		double precoComImposto = getPreco() * (1 + TAXA_ELETRONICO);
		
		if(dataCompra.getMonth() == Month.NOVEMBER) {
			return precoComImposto * (1 - COMPRA_NOVEMBRO);
		}
		
		return precoComImposto;
	}

}
