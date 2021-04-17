package Aula16e17;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		double salario;
		String sexo = ("f") + ("m");
		String estadoCivil = ("s") + ("c") + ("v") + ("d");
		
		do {
			System.out.println("Informe um nome: ");
			nome = scan.next();
			if(nome.length() >= 3) {
				System.out.println("Válido!");
			} else {
				System.out.println("Outro nome: ");
			}
		} while(nome.length() < 3 );
		
		do {
			System.out.println("Informe uma idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				System.out.println("Válido!");
			} else {
				System.out.println("Outra idade: ");
			}
		} while(idade > 0 && idade >= 150);
		
		do {
			System.out.println("Informe um salario: ");
			salario = scan.nextDouble();
			if(salario > 0) {
				System.out.println("Válido!");
			} else {
				System.out.println("Outro salario: ");
			}
		} while(salario <= 0 );
		
		do {
			System.out.println("Informe um sexo: (F / M)");
			sexo = scan.next();
			if("f".equals(sexo)) {
				System.out.println("Sexo feminino!");
				break;
			} else if ("m".equals(sexo)){
				System.out.println("Sexo masculino!");
				break;
			} else {
				System.out.println("Não identificado!");
			}
		} while(sexo != "f" && sexo != "m");
		
		do {
			System.out.println("Informe um estado civil: (S / C / V / D)");
			estadoCivil = scan.next();
			if("s".equals(estadoCivil)) {
				System.out.println("Solteiro(a)!");
				break;
			} else if ("c".equals(estadoCivil)){
				System.out.println("Casado(a)!");
				break;
			} else if ("v".equals(estadoCivil)){
				System.out.println("Viuvo(a)!");
				break;
			} else if ("d".equals(estadoCivil)){
				System.out.println("Divorciado(a)!");
				break;
			} else {
				System.out.println("Não identificado!");
			}
		} while(estadoCivil != "s" || estadoCivil != "c" || estadoCivil != "v" || estadoCivil != "d");
	}

}
