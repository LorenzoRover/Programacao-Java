package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos
	no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será
	encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
	mensagem alguma). */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite as coordenadas X e Y: ");
			int x = leia.nextInt();
			int y = leia.nextInt();
			
			if (x>0 && y>0) {
				System.out.println("Quadrante 1");
			} else if (x<0 && y>0) {
				System.out.println("Quadrante 2");
			} else if (x<0 && y<0) {
				System.out.println("Quadrante 3");
			} else if (x>0 && y<0) {
				System.out.println("Quadrante 4");
			} else {
				break;
			}
		}
	}

}
