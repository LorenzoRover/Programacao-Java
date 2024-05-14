package exemplos;

import java.util.Arrays;

public class Programa08 {

	public static void main(String[] args) {
		

		int[] vetor = {3,1,50,12,38,91,105,100,93};
		System.out.println(Arrays.toString(vetor));
		
		// Ordenar o vetor
		Arrays.sort(vetor);
		System.out.println("Vetor ordenado " +
				Arrays.toString(vetor));
		
		// Copia do vetor
		int[] array = {1,5,10,15};
		int[] copia = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(copia));
		
		int[] vetor1 = {1,2,3};
		int[] vetor2 = {1,2,3};
		if (Arrays.equals(vetor1,vetor2)) {
			System.out.println("Os vetores são iguais");
		} else {
			System.out.println("Os vetores são diferentes");
		}
		
		int comprimento = 0;
		while (true) {
			try {			
				System.out.println(vetor1[comprimento]);
				comprimento++;
			} catch (Exception e) {
				break;
			}
			
		}
		System.out.println("O comprimento do vetor é " + comprimento);
		
		
		
		
	
		
		
		
		

	}

}
