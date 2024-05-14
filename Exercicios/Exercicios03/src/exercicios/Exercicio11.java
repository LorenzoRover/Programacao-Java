package exercicios;

public class Exercicio11 {
	
	/* Desenvolva um programa que imprima os números pares de 2 a 20 usando um loop for */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Números pares de entre 2 e 20");
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
