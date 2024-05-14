package exemplos;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de alturas: ");
		int N = leia.nextInt();
		double[] alturas = new double[N];
		double soma = 0;
		
		
		for (int i = 0; i < N; i++  ) {
			System.out.println("Digite a " + (i+1) + "° altura: ");
			alturas[i] = leia.nextDouble();
			soma =  soma + alturas[i];			
		}
		
		double media = soma/N;
		System.out.println("Média das alturas: " + media);		
		leia.close();
	}

}
