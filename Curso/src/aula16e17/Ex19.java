package aula16e17;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int notas;
		double result = 0;

		System.out.println("Informe a quantidades de notas: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Informe a " + i + "º nota: ");
			notas = scan.nextInt();
			
			result += notas;
			
			
			System.out.println(result);
		}
		System.out.println(result / n);
	}

}
