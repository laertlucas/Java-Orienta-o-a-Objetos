package aula34;

public class Contador {
	public static int cont;
	
	public Contador() {
		cont++;
	}
	
	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}
}
