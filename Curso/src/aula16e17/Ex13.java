package aula16e17;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número base: ");
		int base = scan.nextInt();
		
		System.out.println("Informe o número expoente: ");
		int expoente = scan.nextInt();
		
		int cont = base;
		
		for(int i = 1; i < expoente; i++) {
			cont *= base;
		}
		System.out.println(cont);
	}

}
