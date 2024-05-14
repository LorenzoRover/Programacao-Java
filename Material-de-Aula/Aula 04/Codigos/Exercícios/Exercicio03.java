package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia  = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas "
				+ "que você quer registrar: ");
		int N = leia.nextInt();
		
		// Criando os vetores
		String[] nomes= new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];
		double soma = 0;
		int menor16 = 0;		
		for (int i = 0; i < N; i++) {
			leia.nextLine(); // limpeza buffer
			System.out.println("Digite o nome da " + (i+1) + "° pessoa");
			nomes[i] = leia.nextLine();
			
			System.out.println("Digite a idade de " + nomes[i]);
			idades[i] = leia.nextInt();
			if (idades[i] < 16) {
				menor16++;
			}
			
			System.out.println("Digite a altura de " + nomes[i]);
			alturas[i] = leia.nextDouble();
			soma = soma + alturas[i];			
		}
		double media = soma/N;		
		double porcentagem = ( (double)  menor16/N)  * 100.0;
		System.out.println("A média das alturas é: " + media);
		System.out.printf("A porcentagem de menor de que 16 anos é %.2f% %n", porcentagem);
		System.out.println("Nome das pessoas menores que 16: ");
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		// Bonus - Vetor com apenas os menores de idade
		String[] nomesMenor16 = new String[menor16];
		int j = 0;
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				nomesMenor16[j] = nomes[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(nomesMenor16));
		
		

	}

}
