package aula16e17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex24 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor diário do Pão: ");
		double pao = scan.nextDouble();
		
		double contador = 0;
		double somador = 0;
		
		for(int i = 1; i <= 50; i++) {
			contador += pao;
			somador += pao;
			
			System.out.println("Valor de " + i + " Unidades: " + new DecimalFormat("#,##0.00").format(somador));
		}
	}

}
