package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	static Scanner leia = new Scanner(System.in);

	/* Crie um função que que converta graus Celsius em Fahrenheit */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c = 0;
		inserirDados(c);
	}

	private static void inserirDados(double c) {
		System.out.println("Digite os graus celsius para converter em fahrenheit : ");
		c = leia.nextDouble();
		double conversao = calculo(c);
		System.out.println("A conversão para fahrenheit é: " + conversao);
	}

	private static double calculo(double c) {
		double conversao = (c * 1.8) + 32;
		return conversao;
	}


}
