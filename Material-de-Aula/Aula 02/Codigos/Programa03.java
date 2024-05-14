package exemplos;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = leia.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = leia.nextInt();
//		leia.nextLine();

		System.out.println("Digite a operação desejada: [+,-,*,/]");
		char operacao = leia.nextLine().charAt(0);
		leia.close();
		double resultado = 0;

		if (operacao == '+') {
			resultado = num1 + num2;
		} else if (operacao == '-') {
			resultado = num1 - num2;
		} else if (operacao == '*') {
			resultado = num1 * num2;
		} else if (operacao == '/') {
			// IF aninhado
			if (num2 != 0) {
				resultado = (double) num1 / num2;
			} else {
				System.out.println("ERRO!!! Divisao por zero!");
				return;
			}

		}
		System.out.println("O resultado é " + resultado);

		// COM SWITCH CASE

		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			// IF aninhado
			if (num2 != 0) {
				resultado = (double) num1 / num2;
			} else {
				System.out.println("ERRO!!! Divisao por zero!");
				return;
			}
			break;
		default:
			System.out.println("Opção inválida");

		}

	}

}
