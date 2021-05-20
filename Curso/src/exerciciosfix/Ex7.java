package exerciciosfix;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe X: ");
		int x = scan.nextInt();
		
		while (x != 1) {
			if(x%2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			 
			System.out.println(x);
		}
	}

}
