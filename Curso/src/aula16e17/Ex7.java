package aula16e17;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		for(int i = 1; i <= 5; i++) {
			System.out.println("Informe o " + i + "º número: ");
			num = scan.nextInt();
			
			if(num > maior) {
				maior = num;
			}
		}
		System.out.println(maior);
	}

}
