package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();

		String letras = "abcdefghijklmnopqrstuvwxyz";
		String palavraFormada = "";
		int count = 0;

		System.out.println("Digite o tamanho da string: ");
		int tamanho = leia.nextInt();

		for (int i = 0; i < tamanho; i++) {
			int posicao = aleatorio.nextInt(0, letras.length());
			palavraFormada += letras.charAt(posicao);

			if (letras.charAt(posicao) == 'a') {
				count = count + 1;
			}
		}

		System.out.println("Palavra formada: " + palavraFormada);
		System.out.println("Quantia de vezes que a letra 'a' foi encontrada: " + count);
	}

}
