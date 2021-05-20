package exerciciosfix;

public class Ex2 {

	public static void main(String[] args) {
		//Imprima	a	soma	de	1	até	1000.
		
		int soma = 0;
		
		for(int i = 0; i <= 1000; i++) {
			soma += i;
			
			System.out.println(soma);
		}
		System.out.println("total" + soma);
	}

}
