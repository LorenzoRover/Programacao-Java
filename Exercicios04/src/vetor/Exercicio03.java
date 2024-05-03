package vetor;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade de pessoas: ");
		int pessoas = leia.nextInt();
		double[] altura = new double[pessoas];
		String[] nome = new String[pessoas];
		int[] idade = new int[pessoas];
		String[] nomeMenor = new String[pessoas];

		double somaAltura = 0;
		int idadeMenor = 0;

		for (int i = 0; i < pessoas; i++) {
			leia.nextLine();

			System.out.println("Nome: ");
			nome[i] = leia.nextLine();

			System.out.println("Altura: ");
			altura[i] = leia.nextDouble();

			System.out.println("Idade: ");
			idade[i] = leia.nextInt();

			somaAltura = somaAltura + altura[i];

			if (idade[i] < 16) {
				idadeMenor++;
				nomeMenor[i] = nome[i];
			}

		}

		System.out.println("Nome\t\t\tAltura\tIdade");

		for (int i = 0; i < pessoas; i++) {
			System.out.println(nome[i] + "\t\t\t" + altura[i] + "\t" + idade[i]);
		}

		double alturaMedia = somaAltura / pessoas;
		System.out.println("Altura média: " + alturaMedia);

		double porcentagemAbaixo = (idadeMenor / pessoas) * 100;
		System.out.println("Porcentagem de pessoas abaixo de 16 anos e seus nomes");
		System.out.print("Porcentagem: " + porcentagemAbaixo + "%. Nomes: ");

		for (int i = 0; i < pessoas; i++) {
			if (nomeMenor[i] != null) {
				System.out.println(nomeMenor[i]);
			}
		}
	}

}
