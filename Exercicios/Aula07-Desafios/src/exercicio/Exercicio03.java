package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Quarto;

public class Exercicio03 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Quarto>[] quartos = new ArrayList[9];

		adicionarPessoa(quartos);
		mostrarQuartosOcupados(quartos);
	}

	private static void mostrarQuartosOcupados(List<Quarto>[] quartos) {
		
		//fazer uma copia para dar sort
		List<Quarto>[] quartoEmOrdemLists = new ArrayList[9];
		quartoEmOrdemLists.clone();
		for (List<Quarto> quarto : quartos) {
			quarto.toString();
		}
	}

	private static void adicionarPessoa(List<Quarto>[] quartos) {
		System.out.println("Quantas pessoas você quer adicionar? ");
		int quantidade = leia.nextInt();

		for (int i = 0; i < quantidade; i++) {
			while (true) {
				System.out.println("Digite o número do quarto: ");
				int quarto = leia.nextInt();

				if (quartos[quarto].isEmpty()) {
					System.out.println("Nome da pessoa: ");
					String nome = leia.nextLine();
					System.out.println("Email: ");
					String email = leia.nextLine();
					leia.nextLine();

					Quarto adicionarPessoa = new Quarto(quarto, nome, email);
					quartos[quarto].add(adicionarPessoa);
					break;
					
				} else {
					System.out.println("Número inválido ou quarto ocupado");
				}
			}
		}

	}

}
