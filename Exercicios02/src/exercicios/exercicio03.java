package exercicios;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número entre 0 e 100: ");
		int numero = leia.nextInt();

		if (numero >= 0 && numero <= 25) {
			System.out.println("O valor " + numero + " se encontra no intervalo 1");
		} else if (numero >= 26 && numero <= 50) {
			System.out.println("O valor " + numero + " se encontra no intervalo 2");
		} else if (numero >= 51 && numero <= 75) {
			System.out.println("O valor " + numero + " se encontra no intervalo 3");
		} else if (numero >= 76 && numero <= 100) {
			System.out.println("O valor " + numero + " se encontra no intervalo 4");
		} else {
			System.out.println("Número informado fora do intervalo");
		}
	}

}
