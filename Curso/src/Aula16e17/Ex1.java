package Aula16e17;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma nota entre (0 / 10)");
		int nota = scan.nextInt();
		
		if(nota > 10) {
			System.out.println("Número inválido!");
		}
		
		while(nota >= 0 && nota <= 10) {
			System.out.println("Sua nota é: "+ nota);
			break;
		}
	}

}
