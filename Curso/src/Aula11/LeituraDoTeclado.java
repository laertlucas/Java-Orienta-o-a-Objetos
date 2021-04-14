package Aula11;

import java.util.Scanner;

public class LeituraDoTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome é: " + nomeCompleto);
		
		System.out.println("Informe seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é de: " + altura);
		

	}

}
