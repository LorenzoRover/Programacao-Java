package exemplos;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int N = leia.nextInt();		
		int[] numeros = new int[N];
		
		for (int i= 0; i < N; i++) {
			System.out.println("Insira o numero na posição " + i);
			numeros[i] = leia.nextInt();			
		}	
		
		int negativos = 0;
		for (int i= 0; i < N; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
				negativos++;
			}	else {
				
			}
		}
		System.out.println("Quantidade de numeros negativos: " + negativos);
		
		
		
		
		
		
	}

}
