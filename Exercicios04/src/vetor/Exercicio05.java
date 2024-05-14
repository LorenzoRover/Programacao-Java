package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {
	
	/* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados
	pelos números 0 a 9. Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
	uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a
	10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e
	email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Um quarto ocupado não pode
	ser alugado! Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por
	ordem de quarto, conforme exemplo. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite de 1 a 10 a quantidade de estudantes que irão alugar os quartos: ");
		int alunos = leia.nextInt();
		String[] quarto = new String[10];
		int numero = 0;

		if (alunos > 10 || alunos < 1) {
			System.out.println("Número inválido");

		} else {
			for (int i = 0; i < alunos; i++) {
				leia.nextLine();

				System.out.println("Nome: ");
				String nome = leia.nextLine();

				System.out.println("Email: ");
				String email = leia.nextLine();

				System.out.println("Número do quarto: ");

				while (true) {
					numero = leia.nextInt();
					numero--;
					if (numero < 0 || numero > 9) {
						System.out.println("Número inválido");

					} else if (quarto[numero] != null) {
						System.out.println("Quarto ocupado");

					} else {
						quarto[numero] = (numero + 1) + "\t\t" + nome + "\t\t\t" + email;
						System.out.println("Registrado");
						break;
					}
				}
			}

			System.out.println();
			System.out.println("Quartos ocupados: ");
			System.out.println("Quarto\tNome\t\t\tEmail");

			for (int i = 0; i < quarto.length; i++) {
				if (quarto[i] != null) {
					System.out.println(quarto[i]);
				}
			}

		}

	}

}
