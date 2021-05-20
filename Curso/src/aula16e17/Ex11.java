package aula16e17;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		int cont = 0;
		
		for(int i = num1; i <= num2; i++) {
			cont += i;
		}
		System.out.println(cont);
	}

}
