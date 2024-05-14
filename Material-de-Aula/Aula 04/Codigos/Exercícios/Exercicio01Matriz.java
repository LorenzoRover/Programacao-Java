package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// [Linha][Coluna]
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int[][] resultado = new int[3][3];
		
		// Preenchendo a matriz1
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				System.out.println("Digite o valor "
						+ "na linha" + i + " coluna " + j);
				matriz1[i][j] = leia.nextInt();
			}
		}
		
		
		// Preenchendo a matriz1
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				System.out.println("Digite o valor "
						+ "na linha" + i + " coluna " + j);
				matriz2[i][j] = leia.nextInt();
			}
		}
		
		// SOMA
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(resultado));
		
		
	}

}
