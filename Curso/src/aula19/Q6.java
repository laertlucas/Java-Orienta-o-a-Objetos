package aula19;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
 		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(i);
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];			
		}
		
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		
	}

}
