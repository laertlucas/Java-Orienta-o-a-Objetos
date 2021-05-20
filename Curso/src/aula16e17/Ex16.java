package aula16e17;

public class Ex16 {

	public static void main(String[] args) {
		
		int numZero = 0;
		int primeiro = 1;
		int segundo = 1;
		int terceiro;
		
		System.out.println(numZero);
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 0; i <= 12; i++) {
			
			terceiro = primeiro + segundo;
			primeiro = segundo;
			segundo = terceiro;
			
			System.out.println(terceiro);
		}
	}

}
