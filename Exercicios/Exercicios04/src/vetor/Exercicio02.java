package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {
	
	/* Faça um programa que leia um vetor de 10 números inteiros e verifique se ele está em ordem crescente. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int[] numero = new int[10];
		boolean crescente = false;

		System.out.println("Digite 10 números inteiros: ");

		for (int i = 0; i < numero.length; i++) {
			numero[i] = leia.nextInt();
		}

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == numero[0] || numero[i] > numero[i-1]) {
				crescente = true;
			} else {
				crescente = false;
				break;
			}
		}

		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " ");
		}

		if (crescente == true) {
			System.out.println("Números estão em ordem crescente");
		} else {
			System.out.println("Números estão em ordem decrescente\nNúmeros arrumados: ");
			Arrays.sort(numero);
			for (int i = 0; i < numero.length; i++) {
				System.out.print(numero[i] + " ");
			}
		}
	}

}
