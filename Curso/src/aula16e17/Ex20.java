package aula16e17;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int nPessoas = scan.nextInt();
		
		int idade;
		double media = 0;
		
		for(int i = 1; i <= nPessoas; i++) {
			System.out.println("informe a idade da " + i + "º pessoa: ");
			idade = scan.nextInt();
			
			media += idade;
		}
		
		media = media / nPessoas;
		
		System.out.println(media);
		
		if(media > 0 && media <= 26) {
			System.out.println("Jovens!");
		} else if (media > 26 && media <= 60) {
			System.out.println("Adultos!");
		} else {
			System.out.println("Idosos!");
		}
	}

}
