package aula25a27;

import java.util.Scanner;

public class TesteJogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("X");
		System.out.println("O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			if(jogoDaVelha.vezJogador1()) {
				System.out.println("X - escolha linha e coluna (1-3)");
				sinal = 'X';
			}else {
				System.out.println("O - escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			jogoDaVelha.validarJogada(linha, coluna, sinal);
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("X - Ganhou");
			} else if(jogoDaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("O - Ganhou");
			} else if(jogoDaVelha.jogada > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou!");
			}
				
			}
		}
	
	static int valor (String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while(!valorValida) {
			System.out.println("Entre com a " + tipoValor + "(1, 2 ou 3)");
			valor = scan.nextInt();
			if(valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente!");
			}
		}
		valor--;
		return valor;
	}
}
