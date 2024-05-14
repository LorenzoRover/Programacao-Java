package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	/* Crie um programa que solicite ao usuário o nome de um dia da semana e informe se é um dia útil ou um
	final de semana. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		System.out.println("Escreva o dia da semana: ");
		String dia = leia.nextLine();

		boolean diaUtil = true;
		boolean erro = false;

		switch (dia) {
		case "Domingo":
			diaUtil = false;
			break;
		case "Segunda":
			diaUtil = true;
			break;
		case "Terça":
			diaUtil = true;
			break;
		case "Quarta":
			diaUtil = true;
			break;
		case "Quinta":
			diaUtil = true;
			break;
		case "Sexta":
			diaUtil = true;
			break;
		case "Sábado":
			diaUtil = false;
			break;
		default:
			System.out.println("Erro na digitalização do nome da semana");
			erro = true;

		}

		if (erro == false) {
			if (diaUtil == true) {
				System.out.println(dia + " é dia útil");
			} else {
				System.out.println(dia + " não é dia útil");
			}
		}
	}

}
