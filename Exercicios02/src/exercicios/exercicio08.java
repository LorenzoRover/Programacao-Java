package exercicios;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor a ser sacado: ");
		int valor = leia.nextInt();

		int nota = 0;

		while (valor != 0) {
			if (valor >= 100) {
				nota++;
				valor = valor - 100;
			} else if (valor >= 50) {
				nota++;
				valor = valor - 50;
			} else if (valor >= 20) {
				nota++;
				valor = valor - 20;
			} else if (valor >= 10) {
				nota++;
				valor = valor - 10;
			} else if (valor >= 5) {
				nota++;
				valor = valor - 5;
			} else if (valor >= 2) {
				nota++;
				valor = valor - 2;
			} else {
				nota++;
				valor = valor - 1;
			}
		}

		System.out.println("Notas contadas: " + nota);
	}

}
