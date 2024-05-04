package matriz;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		Scanner leia = new Scanner(System.in);

		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int soma = 0;

		System.out.println("Digite ate que valor você quer no gerador aleatório");
		int numero = leia.nextInt();

		System.out.println("Números da 1ª matriz: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz1[i][j] = aleatorio.nextInt(numero);
				System.out.print(matriz1[i][j] + "\t");
				soma += matriz1[i][j];
			}
			System.out.println();
		}

		System.out.println("Números da 2ª matriz: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz2[i][j] = aleatorio.nextInt(numero);
				System.out.print(matriz2[i][j] + "\t");
				soma += matriz2[i][j];
			}
			System.out.println();
		}

		System.out.println("Soma total das duas matrizes: " + soma);

	}

}
