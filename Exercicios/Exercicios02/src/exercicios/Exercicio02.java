package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
	}

}
