package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		
		

			System.out.println("Numero");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.println("Usuario:");
			String usuario = sc.nextLine();
			System.out.println("Saldo inicial:");
			double saldo = sc.nextDouble();
			System.out.println("Limite de Saque:");
			double limite = sc.nextDouble();
			Conta acc = new Conta(numero, usuario, saldo, limite);
		try {	
			System.out.println("Quanto deseja sacar?");
			double novoSaque = sc.nextDouble();
			acc.saque(novoSaque);			
			System.out.printf("%.2f", acc.getSaldo());
		}
		catch(DomainException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
