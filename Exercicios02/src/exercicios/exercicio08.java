package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	
	/* Elabore um programa que simule um caixa eletrônico. O usuário deve informar o valor que deseja sacar.
	O programa deve calcular o número de notas de cada valor (100, 50, 20, 10, 5, 2, 1) necessárias para
	compor o valor total. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor a ser sacado: ");
		int valor = leia.nextInt();

		int nota = 0;

		while (valor != 0) {
			if (valor >= 100) {
				nota++;
				valor = valor - 100;
			} else if (valor >= 50) {
				nota++;
				valor = valor - 50;
			} else if (valor >= 20) {
				nota++;
				valor = valor - 20;
			} else if (valor >= 10) {
				nota++;
				valor = valor - 10;
			} else if (valor >= 5) {
				nota++;
				valor = valor - 5;
			} else if (valor >= 2) {
				nota++;
				valor = valor - 2;
			} else {
				nota++;
				valor = valor - 1;
			}
		}

		System.out.println("Notas contadas: " + nota);
	}

}
