package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	/* Elabore um programa que receba três notas de um aluno e calcule a média. Se a média for maior ou
	igual a 7, imprima "Aprovado"; caso contrário, imprima "Reprovado". */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite três notas do aluno: ");
		double nota1 = leia.nextDouble();
		double nota2 = leia.nextDouble();
		double nota3 = leia.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Aluno aprovado com a nota " + media);
		} else {
			System.out.println("Aluno reprovado com a nota " + media);
		}
	}

}
