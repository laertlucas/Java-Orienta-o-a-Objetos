package Aula16e17;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = scan.next();
		
		System.out.println("Informe uma senha: ");
		String senha = scan.next();
		
		do {
			System.out.println("Senha inválida!");
			System.out.println("Informe nova senha: ");
			String novaSenha = scan.next();
		} while(senha == nome);
		
		System.out.println("Agora sim, cadastro realizado!");
	}

}
