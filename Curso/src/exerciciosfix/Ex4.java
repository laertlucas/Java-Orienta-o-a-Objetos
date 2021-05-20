package exerciciosfix;

public class Ex4 {

	public static void main(String[] args) {
		 //Imprima	os	fatoriais	de	1	a	10.
		
		int n = 1;
		
		for(int i = 1; i <= 10; i++) {
			n = n * i;
		
			System.out.println("!"+ i + " é: " + n);
		}
	}

}
