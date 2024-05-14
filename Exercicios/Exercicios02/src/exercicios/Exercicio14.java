package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	
	/* Crie um programa que exibe um menu com opções numeradas de 1 a 3. O usuário deve escolher uma
	opção, e o programa deve exibir uma mensagem correspondente. Utilize a instrução switch-case. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Máquina de bebidas (Digite 1 para água, 2 para refrigerante e 3 para suco): ");
		int opcao = leia.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Você optou por água");
			break;
		case 2:
			System.out.println("Você optou por refrigerante");
			break;
		case 3:
			System.out.println("Você optou por suco");
			break;
		default:
			System.out.println("Opção inválida");

		}
	}

}
