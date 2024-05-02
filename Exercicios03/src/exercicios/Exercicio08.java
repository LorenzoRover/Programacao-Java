package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int quantidade = leia.nextInt();
		int intervaloIn = 0;
		int intervaloOut = 0;

		System.out.println("Digite " + quantidade + " número(s): ");

		for (int i = 0; i < quantidade; i++) {
			int numero = leia.nextInt();

			if (numero >= 10 && numero <= 20) {
				intervaloIn = intervaloIn + 1;
			} else {
				intervaloOut = intervaloOut + 1;
			}

		}

		System.out.println("Intervalos: \n" + intervaloIn + " In \n" + intervaloOut + " Out");

	}

}
