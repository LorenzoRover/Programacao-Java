package vetor;

import java.util.Scanner;

public class Exercicio01 {
	
	/* Crie um programa que leia um vetor de 10 números inteiros e exiba a soma de todos os elementos. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[] numero = new int[10];
		int numeroTotal = 0;
		
		System.out.println("Digite 10 números inteiros: ");
		
		for (int i = 0; i < numero.length; i++) {
			numero[i] = leia.nextInt();
			numeroTotal = numeroTotal + numero[i];
		}
		
		System.out.println("Soma dos números: " + numeroTotal);
	}

}
