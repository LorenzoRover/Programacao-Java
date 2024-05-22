package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner leia = new Scanner(System.in);
	
	/* Escreve uma função que realize a comparação de duas Strings. Retorne verdadeiro caso as Strings
	forem iguais. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "";
		String string2 = "";
		
		comparacaoDeStrings(string1, string2);
	}

	private static void comparacaoDeStrings(String string1, String string2) {
		System.out.println("Digite duas string para serem comparadas se são iguais ou não: ");
		string1 = leia.nextLine();
		string2 = leia.nextLine();
		
		boolean comparacao = comparar(string1, string2);
		System.out.println("As strings são iguais? " + comparacao);
	}

	private static boolean comparar(String string1, String string2) {
		if (string1.equals(string2)) {
			return true;
		}
		return false;
	}

}
