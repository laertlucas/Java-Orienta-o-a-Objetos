package Aula11;

import java.util.Scanner;

public class LeituraDoTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome �: " + nomeCompleto);
		
		System.out.println("Informe seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura � de: " + altura);
		

	}

}
