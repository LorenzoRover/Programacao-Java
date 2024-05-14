package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		if (numero > 0) {
			System.out.println("Este número é positivo");
		} else if (numero < 0) {
			System.out.println("Este número é negativo");
		} else {
			System.out.println("Número 0 não é negativo e nem positivo");
		}
	}

}
