package aula16e17;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double media;
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Informe um número: ");
			num = scan.nextInt();
			soma += num;
		}
		media = soma / 5;
		
		System.out.println(media);
	}

}
