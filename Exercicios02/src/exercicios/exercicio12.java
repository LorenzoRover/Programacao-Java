package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	
	/* Usando o operador ternário, crie um programa que recebe dois números inteiros como entrada e exibe o
	maior deles. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite dois números: ");
		int num1 = leia.nextInt();
		int num2 = leia.nextInt();

		int numMaior = (num1 > num2) ? num1 : num2;
		System.out.println("Número maior: " + numMaior);
	}

}
