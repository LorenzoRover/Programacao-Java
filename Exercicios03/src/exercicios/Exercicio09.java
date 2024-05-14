package exercicios;

public class Exercicio09 {
	
	/* Elabore um programa que calcule a soma dos números de 1 a 100 usando um loop for */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 0;

		for (int i = 1; i <= 100; i++) {
			soma = soma + i;
		}

		System.out.println("Valor da soma dos números de 1 a 100: " + soma);

	}

}
