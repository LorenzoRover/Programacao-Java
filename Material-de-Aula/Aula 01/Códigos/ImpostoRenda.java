package exemplos;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digita sua renda bruta: ");
		double rendaBruta = leia.nextDouble();
		
		System.out.println("Quantos dependentes? ");
		int numDependentes = leia.nextInt();
		
		double rendaTributavel = rendaBruta - 10000 - (3000 * numDependentes);
		double imposto = rendaTributavel  *  20/100;
		System.out.println("Valor a ser pago: " + imposto);
		leia.close();
		
		
		
		
		
		
		
		
		
		

	}

}
