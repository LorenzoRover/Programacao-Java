package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	/* Elabora a funcionalidade do método equals da classe String usando estrutura de repetição */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String palavra1 = "";
		String palavra2 = "";
		String palavra3 = "";

		while (true) {
			System.out.println("Digite tres palavras (se pelomenos duas forem iguais o programa se repetirá): ");
			palavra1 = leia.nextLine();
			palavra2 = leia.nextLine();
			palavra3 = leia.nextLine();

			if (palavra1.equals(palavra2) || palavra1.equals(palavra3) || palavra2.equals(palavra3)) {
				System.out.println("Foram encontradas palavras iguais");
			} else {
				System.out.println("Nenhuma das 3 palavras são iguais. \nPrograma finalizado");
				break;
			}

		}

	}

}
