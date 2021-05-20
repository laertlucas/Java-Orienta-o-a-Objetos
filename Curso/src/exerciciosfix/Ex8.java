package exerciciosfix;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = scan.nextInt();
		
		for(int linha = 1; linha <= num; linha++) {
			for(int coluna = 1; coluna <= linha; coluna++) {
				System.out.print(linha * coluna + " ");
			}
			System.out.println();
		}
	}

}
