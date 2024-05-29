package aplicacao;

import java.util.Scanner;

import entidade.Triangulo;

public class Programa02 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os valores para o triangulo X");
		double a = leia.nextDouble();
		double b = leia.nextDouble();
		double c = leia.nextDouble();
		
		Triangulo trianguloX = new Triangulo();
		trianguloX.a = a;
		trianguloX.b = b;
		trianguloX.c = c;
		
		double areaX = trianguloX.calcularArea();
		
		System.out.println("Digite os valores para o triangulo Y");
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		
		Triangulo trianguloY = new Triangulo();
		trianguloY.a = a;
		trianguloY.b = b;
		trianguloY.c = c;
		
		

	}

}
