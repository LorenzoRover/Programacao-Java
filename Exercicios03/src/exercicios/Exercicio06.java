package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		if (numero <= 0) {
			System.out.println("Número inválido (número zero ou negativo)");
		}else for (int i = 0; i <= numero; i++) {
			int quadrado = 0;
			int cubo = 0;
			
			quadrado = i * i;
			cubo = i * i * i;
			
			System.out.println("Número "+ i +". Elevado ao quadrado: "+ quadrado +". Elevado ao cubo: "+ cubo +".");
		}

	}

}
