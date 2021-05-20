package aula16e17;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número da tabuada que deseja:  ");
		int num = scan.nextInt();
		
		int cont = 0;
		
		System.out.println("Tabuada de " + num + ":");
		
		for(int i = 0; i <= 10; i++) {
			cont = num * i;
			
			System.out.println(num + " X " + i + " = " + cont);
		}
	}

}
