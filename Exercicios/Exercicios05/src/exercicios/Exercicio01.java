package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
	
	/* Crie uma função que recebe um vetor de notas de alunos (em escala de 0 a 10) e mostre a média, a
	maior nota e a menor nota. */

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite a quantidade de notas que serão inseridas no vetor");
		int v = leia.nextInt();
		double[] nota = new double[v];
		inserirNota(nota);
	}

	private static void menorNota(double[] nota) {
		double notaMenor = nota[0];
		System.out.println("Nota menor: " + notaMenor);
	}

	private static void maiorNota(double[] nota) {
		double notaMaior = nota[nota.length];
		System.out.println("Nota maior: " + notaMaior);
	}

	private static void inserirNota(double[] nota) {
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª nota: ");
			nota[i] = leia.nextDouble();
		}
		Arrays.sort(nota);
		calcularMedia(nota);
		maiorNota(nota);
		menorNota(nota);
	}

	private static void calcularMedia(double[] nota) {
		double soma = 0;
		
		for (double notas:nota) {
			soma += notas;
		}
		
		double media = soma / nota.length;
		System.out.println("Média do aluno: " + media);
	}
	

}
