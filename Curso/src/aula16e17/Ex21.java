package aula16e17;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de turmas: ");
		int turmas = scan.nextInt();
		
		int alunos;
		double media = 0;
		
		for(int i = 1; i <= turmas; i++) {
			System.out.println("Informe a quantidade de alunos da " + i + "º turma: ");
			alunos = scan.nextInt();
			
			media += alunos;
		}
		System.out.println("Média de alunos por turma: " + (media / turmas));
	}

}
