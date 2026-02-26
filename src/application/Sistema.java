package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Eletronico;
import entities.Livro;
import entities.Roupa;
import entities.enums.Tamanhos;

public class Sistema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Cliente> clientes = new ArrayList<>();
		
		System.out.println("Digite a quantidade de compras que teve no dia hoje: ");
		int compras = sc.nextInt();
		LocalDate dataDaCompra = LocalDate.now();
		
		for(int i = 1; i <= compras; i++) {
		    sc.nextLine();

		    System.out.print("Digite o nome da pessoa " + i + ": ");
		    String nome = sc.nextLine();

		    System.out.print("Digite o cpf dessa pessoa: ");
		    String cpf = sc.next();
		    
		    System.out.print("Quantos produtos esse cliente comprou: ");
		    int quantidade = sc.nextInt();
		    
		    Cliente cliente = new Cliente(nome, cpf);  
		    
		    for(int j = 1; j <= quantidade; j++) {
		    	sc.nextLine();
		    	System.out.print("Digite o nome do produto "+ j +": ");
		    	String nomeprod = sc.nextLine();
		    	System.out.print("Digite o id: ");
		    	Integer id = sc.nextInt();
		    	System.out.print("Digite o preco: ");
		    	double preco = sc.nextDouble();
		    	System.out.println("Digite qual tipo de produto é: ");
		    	System.out.print("1 - eletronico, 2 - livro, 3 - roupa: ");
		    	int opcao = sc.nextInt();
		    	
		    	switch(opcao) {
		    	
		    	case 1:
		    		sc.nextLine();
		    		System.out.print("Qual a marca do eletronico: ");
		    		String marca = sc.nextLine();
		    		Eletronico eletronico = new Eletronico(nomeprod, id, preco, marca);
		    		cliente.getCarrinho().adicionarProduto(eletronico);
		    		break;
		    	case 2: 
		    		sc.nextLine();
		    		System.out.print("Digite o nome do autor: ");
		    		String autor = sc.nextLine();
		    		Livro livro = new Livro(nomeprod, id, preco, autor);
		    		cliente.getCarrinho().adicionarProduto(livro);
		    		break;
		    	case 3:
		    		System.out.print("Digite o tamanho da roupa(PP/P/M/G/GG): ");
		    		Tamanhos tamanho = Tamanhos.valueOf(sc.next().toUpperCase());
		    		Roupa roupa =  new Roupa(nomeprod, id, preco, tamanho);
		    		cliente.getCarrinho().adicionarProduto(roupa);
		    		break;
		    		
		    	}		
		    }
		    double total = cliente.getCarrinho().calcularTotal(dataDaCompra);
		    System.out.println("Total da compra de " + nome + ": " + total);
		    clientes.add(cliente); 
		}
		
		
		sc.close();
	}

}
