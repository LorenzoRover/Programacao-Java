package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N
	linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo
	do valor, conforme exemplo. */

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
