package desafio02;

import java.util.Scanner;

public class Desafio02 {
	
	/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em
	um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
	cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
	ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite dois valores: ");
		double x = leia.nextDouble();
		double y = leia.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		} else if (x > 0 && y < 0){
			System.out.println("Quadrante 4");
		} else {
			System.out.println("Origem");
		}
		
	}

}
