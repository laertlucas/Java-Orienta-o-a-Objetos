package aula16e17;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de CDS: ");
		int cd = scan.nextInt();
		
		double price;
		double soma = 0;
		double media = 0;
		
		for(int i = 1; i <= cd; i++) {
			System.out.println("Informe o valor do " + i + "º CD: ");
			price = scan.nextDouble();
			
			soma += price;
		}
		System.out.println(soma);
		
		media = soma / cd;
		
		System.out.println("Média gasta por CD é de: " + media);
	}

}
