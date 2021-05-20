package aula34;

public class TestaCalculadora {

	public static void main(String[] args) {
		imprimirTela(Calculadora.somar(5, 5));
		
		imprimirTela(Calculadora.subtrair(15, 5));
		
		imprimirTela(Calculadora.multiplicar(5, 5));
		
		imprimirTela(Calculadora.dividir(30, 5));
		
		imprimirTela(Calculadora.potencia(4, 3));
		
		imprimirTela(Calculadora.fatorial(6));
	}
	
	static void imprimirTela(double num) {
		System.out.println(num);
	}
}
