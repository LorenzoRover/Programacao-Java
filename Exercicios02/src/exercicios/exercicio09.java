package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	
	/* Crie um programa que simule um jogo de dados. O usuário lança dois dados (cada um com valores de 1
	a 6) e o programa determina se o usuário ganhou ou perdeu com base na soma dos valores. Se a soma
	for 7 ou 11, o usuário ganha. Se a soma for 2, 3 ou 12, o usuário perde. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Lance dois dados: ");
		int dado1 = leia.nextInt();
		int dado2 = leia.nextInt();
		int somaDados = dado1 + dado2;

		switch (somaDados) {

		case 7:
			System.out.println("Você venceu");
			break;
		case 11:
			System.out.println("Você venceu");
			break;
		case 2:
			System.out.println("Você perdeu");
			break;
		case 3:
			System.out.println("Você perdeu");
			break;
		case 12:
			System.out.println("Você perdeu");
			break;
		default:
			System.out.println("Nenhum valor correspondente");

		}
	}

}
