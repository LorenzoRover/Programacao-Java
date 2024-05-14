package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	
	/* Desenvolva um programa que peça ao usuário para inserir um número de 1 a 12 representando um mês
	do ano. O programa deve imprimir o número de dias e o nome do mês usando um switch-case. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número do mês: ");
		int dia = leia.nextInt();

		switch (dia) {

		case 1:
			System.out.println("Mês janeiro composto por 31 dias");
			break;
		case 2:
			System.out.println("Mês fevereiro composto por 29 dias");
			break;
		case 3:
			System.out.println("Mês março composto por 31 dias");
			break;
		case 4:
			System.out.println("Mês abril composto por 30 dias");
			break;
		case 5:
			System.out.println("Mês maio composto por 31 dias");
			break;
		case 6:
			System.out.println("Mês junho composto por 30 dias");
			break;
		case 7:
			System.out.println("Mês julho composto por 31 dias");
			break;
		case 8:
			System.out.println("Mês agosto composto por 31 dias");
			break;
		case 9:
			System.out.println("Mês setembro composto por 30 dias");
			break;
		case 10:
			System.out.println("Mês outubro composto por 31 dias");
			break;
		case 11:
			System.out.println("Mês novembro composto por 30 dias");
			break;
		case 12:
			System.out.println("Mês dezembro composto por 31 dias");
			break;
		default:
			System.out.println("Número inválido!");

		}
	}

}
