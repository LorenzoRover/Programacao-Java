package matriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0;
		int h = 0;

		System.out.println("Digite os valores da matriz: ");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Números da " + (i + 1) + "ª linha: ");
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = leia.nextInt();

				if (matriz[i][j] == matriz[i][h]) {
					somaPrincipal += matriz[i][j];
				}
			}
			h++;
		}

		System.out.println("Valores da matriz: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Soma da diagonal principal: " + somaPrincipal);

	}

}
