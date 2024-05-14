package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
	/* Desenvolva um programa que peça ao usuário três números e imprima o maior deles. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite três números: ");
		int num1 = leia.nextInt();
		int num2 = leia.nextInt();
		int num3 = leia.nextInt();

		int numMaior = num1;

		if (num2 > numMaior && num2 > num3) {
			numMaior = num2;
		} else if (num3 > numMaior) {
			numMaior = num3;
		}

		System.out.println("O número maior é " + numMaior);
	}

}
