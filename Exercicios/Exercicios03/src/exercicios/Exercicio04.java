package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
	inclusive X, se for o caso. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor para saber números pares entre ele: ");
		int numero = leia.nextInt();

		System.out.println("Números pares entre o número " + numero);

		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
