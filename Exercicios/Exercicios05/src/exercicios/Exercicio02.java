package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	/* Escreva uma função que receba a base e a altura de um triângulo e retorne sua área (A = (base x
	altura)/2). */

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base = 0;
		double altura = 0;
		inserirDados(base, altura);
	}

	private static void inserirDados(double base, double altura) {
		System.out.println("Digite a base e a altura do triângulo: ");
		base = leia.nextDouble();
		altura = leia.nextDouble();
		
		double area = calcularArea(base, altura);
		System.out.println("A área do triângulo é: " + area);
	}

	private static double calcularArea(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}

}
