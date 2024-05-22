package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	/* Escreva uma função que calcule o fatorial de um número */

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		calcularFatorial(numero);
	}

	private static void calcularFatorial(int numero) {
		System.out.println("Digite um número parar calcular o seu fatorial: ");
		numero = leia.nextInt();

		int fatorial = calcular(numero);
		System.out.println(fatorial);
	}

	private static int calcular(int numero) {
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

}
