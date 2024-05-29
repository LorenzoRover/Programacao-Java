package aplicacao;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os valores para o triangulo X");
		double xA = leia.nextDouble();
		double xB = leia.nextDouble();
		double xC = leia.nextDouble();
		
		double xP = (xA+ xB + xC)/2;
		double xArea = Math.sqrt( xP * (xP - xA) * (xP - xB) * (xP - xC));
		
		System.out.println("Digite os valores para o triangulo y");
		double yA = leia.nextDouble();
		double yB = leia.nextDouble();
		double yC = leia.nextDouble();
		
		double yP = (yA+ yB + yC)/2;
		double yArea = Math.sqrt( yP * (yP - yA) * (yP - yB) * (yP - yC));

		System.out.println("Area do triangulo X: " + xArea);
		System.out.println("Area do triangulo Y: " + yArea);
		
		if (xArea > yArea) {
			System.out.println("Maior Area: X");
		} else {
			System.out.println("Maior Area: Y");
		}
		
		
		
	}

}
