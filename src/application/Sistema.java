package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Sistema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Cliente> clientes = new ArrayList<>();
		
		System.out.println("Digite a quantidade de compras que teve no dia hoje: ");
		int compras = sc.nextInt();
		
		for(int i = 1; i <= compras; i++) {
		    sc.nextLine();

		    System.out.print("Digite o nome da pessoa " + i + ": ");
		    String nome = sc.nextLine();

		    System.out.print("Digite o cpf dessa pessoa: ");
		    String cpf = sc.next();

		    Cliente cliente = new Cliente(nome, cpf); 
		    clientes.add(cliente);                   
		}
		
		sc.close();
	}

}
