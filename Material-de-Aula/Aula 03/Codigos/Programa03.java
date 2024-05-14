package exemplos;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número para ver a tabuada");
		int numero = leia.nextInt();
		int multiplicador = 1;
		while (  multiplicador <= 10    ) {
			int resultado = numero * multiplicador;
			System.out.println(numero + " x " + 
			multiplicador + " = "  + resultado);
			multiplicador++;
			
		}

		
		
		leia.close();
	}

}
