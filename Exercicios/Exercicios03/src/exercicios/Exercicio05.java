package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
	/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro
	pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"e encerrar o
	laço de repetição. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite quantos pares de números você quer dividir: ");

		int pares = leia.nextInt();

		for (int i = 0; i < pares; i++) {
			System.out.println("Digite dois números a serem divididos: ");
			int numero1 = leia.nextInt();
			int numero2 = leia.nextInt();
			double nuumero1 = (double) numero1;
			double nuumero2 = (double) numero2;

			if (numero1 == 0) {
				System.out.println("Divisão impossível");
				break;
			}

			double divisao = nuumero1 / nuumero2;
			System.out.println("Divisão: " + divisao);

		}
	}

}
