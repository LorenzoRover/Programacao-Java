package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	
	/* Desenvolva um programa que peça ao usuário uma letra do alfabeto e determine se é uma vogal ou uma
	consoante. Lembre-se do método .contains() de String */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = leia.nextLine().charAt(0);
					
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Você digitou uma vogal");
		} else {
			System.out.println("Você digitou uma consoante");
		}
	}

}
