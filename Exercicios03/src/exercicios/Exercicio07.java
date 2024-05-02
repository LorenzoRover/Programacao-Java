package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número para calcular o fatorial: ");
		int numero = leia.nextInt();
		int fatorial = 1;

		if (numero < 0) {
			System.out.println("Número abaixo de 0");
		} else
			while (numero > 0) {
				fatorial = fatorial * numero;
				numero--;
			}

		System.out.println("Fatorial do número: " + fatorial);

	}

}
