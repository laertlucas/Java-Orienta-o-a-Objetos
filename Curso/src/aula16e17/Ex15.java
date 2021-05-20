package aula16e17;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para sequência Fibonacci: ");
		int num = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int terceiro;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3; i <= num; i++) {
			
			terceiro = primeiro + segundo;
			primeiro = segundo;
			segundo = terceiro;
			
			System.out.println(terceiro);
		}
	}

}
