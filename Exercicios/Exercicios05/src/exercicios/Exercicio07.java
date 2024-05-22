package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
	
	/* Crie uma função que receba um vetor de notas de um aluno. O objetivo da função é retornar uma String
	dizendo se o aluno foi reprovado ou aprovado. Para aprovação a média aritmética das notas deve ser
	maior igual a 6. */
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite a quantidade de notas que serão inseridas no vetor");
		int v = leia.nextInt();
		double[] nota = new double[v];
		inserirNota(nota);
	}

	private static void inserirNota(double[] nota) {
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª nota: ");
			nota[i] = leia.nextDouble();
		}
		
		double media = calcularMedia(nota);
		System.out.println("Média do(a) aluno(a): " + media);
		
		String situacao = situacao(nota);
		System.out.println("Situação: " + situacao);
	}
	
	
	
	private static String situacao(double[] nota) {
		double media = calcularMedia(nota);
		if (media > 6) {
			return "Aprovado(a)";
		}
		return "Reprovado(a)";
	}

	private static double calcularMedia(double[] nota) {
		double soma = 0;
		
		for (double notas:nota) {
			soma += notas;
		}
		
		double media = soma/nota.length;
		return media;
}
}