package aula34;

public class Calculadora {
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	public static double potencia(int num1, int num2) {
		return Math.pow(num1, num2);
	}
	
	public static int fatorial(int num1) {
		if(num1 == 0) {
			return 1;
		}
		
		int total =1;
		
		for(int i=num1; i>1; i--) {
			total *= i;
		}
		return total;
	}
}
