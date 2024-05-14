package vetor;

import java.util.Scanner;

public class Exercicio04 {
	
	/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela
	todos os números pares, e também a quantidade de números pares. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numeroTotal = 0;

		System.out.println("A quantidade de números a ser lida: ");
		int quantidade = leia.nextInt();
		int[] numero = new int[quantidade];
		int[] par = new int[quantidade];
		int quantidadePar = 0;

		System.out.println("Digite os números: ");

		for (int i = 0; i < quantidade; i++) {
			numero[i] = leia.nextInt();

			if (numero[i] % 2 == 0) {
				par[i] = numero[i];
				quantidadePar++;
			}
		}

		System.out.println("Quantidade de números pares: " + quantidadePar + "Números pares digitados: ");

		for (int i = 0; i < quantidade; i++) {
			if (par[i] != 0) {
				System.out.print(par[i] + " ");
			}
		}

	}

}
