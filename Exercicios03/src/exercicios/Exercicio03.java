package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número do combustível: ");
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (true) {
			int numero = leia.nextInt();
			if (numero == 1) {
				System.out.println("ÁLCOOL");
				alcool++;
			} else if (numero == 2) {
				System.out.println("GASOLINA");
				gasolina++;
			} else if (numero == 3) {
				System.out.println("DIESEL");
				diesel++;
			} else if (numero == 4) {
				System.out.println("Muito obrigado!");
				break;
			} else {
				System.out.println("Número inválido");
			}
		}

		System.out.println("Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);

	}

}
