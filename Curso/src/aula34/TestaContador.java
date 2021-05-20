package aula34;

public class TestaContador {

	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}
	
	public static void main(String[] args) {
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.obterValor();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
	}

}
