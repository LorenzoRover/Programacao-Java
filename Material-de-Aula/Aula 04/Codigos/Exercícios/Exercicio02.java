package exercicios;

import java.util.Arrays;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//int[] vetor = {1,5,3,9,7};
		int[] vetor = {1,3,5,7,9};
		
		// Copia
		int[] copiaVetor = Arrays.copyOf(vetor, vetor.length);
		
		// Ordenar vetor original
		Arrays.sort(vetor);
		
		boolean resposta = Arrays.equals(vetor, copiaVetor);
		System.out.println("O vetor esta ordenado: " + resposta);
		
	
		// Outra maneira
		//int[] vetor1 = {1,5,3,9,7};	
		int[] vetor1 = {1,3,5,7,9};
		
		
		resposta = true;		
		for (int i = 0; i < vetor1.length-1; i++) {			
			if (vetor1[i] > vetor1[i+1]) {
				resposta = false;
				break;
			}
		}
		System.out.println("O vetor esta ordenado: " + resposta);
		
		
		
		

	}

}
