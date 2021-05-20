package aula16e17;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double taxA;
		double popB;
		double taxB;
		boolean valido = false;
		
		do {
			System.out.println("PopA : ");
			popA = scan.nextDouble();
			
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("Inválido");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("PopB : ");
			popB = scan.nextDouble();
			
			if(popB > 0) {
				valido = true;
			} else {
				System.out.println("Inválido");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Taxa A : ");
			taxA = scan.nextDouble();
			
			if(taxA > 0) {
				valido = true;
			} else {
				System.out.println("Inválido");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Taxa B : ");
			taxB = scan.nextDouble();
			
			if(taxB > 0) {
				valido = true;
			} else {
				System.out.println("Inválido");
			}
		} while (!valido);
		
		int cont = 0;
		
		while (popA < popB) {
			popA += (popA / 100) * taxA;
			popB += (popB / 100) * taxB;
			cont++;
		}
		System.out.println(popA);
		System.out.println(popB);
		System.out.println(cont);
	}

}
