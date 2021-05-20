package aula16e17;

import java.text.DecimalFormat;

public class Ex23 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		double produtos = 1.99;
		double contador = 0;
		double somaProd = 0;
		
		for(int i = 1; i <= 50; i++) {
			contador += produtos;
			somaProd += produtos;
			
			System.out.println(i + "º produto: " + new DecimalFormat("#,##0.00").format(somaProd));
		}
	}

}
