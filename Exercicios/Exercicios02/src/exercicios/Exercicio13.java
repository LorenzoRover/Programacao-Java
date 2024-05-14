package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	/* Crie um programa que recebe uma nota de 0 a 10 e converte para um conceito de A a F utilizando a
	instrução switch-case.
	A: 9-10
	B: 8
	C: 7
	D: 6
	E: 5
	F: restante (default) */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a nota: ");
		int nota = leia.nextInt();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
		} else {
		switch (nota) {

		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		default:
			System.out.println("F");

		}
	}
	}

}
