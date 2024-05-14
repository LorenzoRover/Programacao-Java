package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	
	/* Desenvolva um programa que peça ao usuário para inserir números até que ele insira um número negativo.
	O programa deve então imprimir a soma dos números positivos inseridos. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int soma = 0;

		while (true) {
			System.out.println("Digite um número: ");
			int numero = leia.nextInt();

			if (numero < 0) {
				System.out.println("Número negativo");
				break;
			}

			soma = soma + numero;
		}

		System.out.println("A soma dos números inseridos é " + soma);

	}

}
