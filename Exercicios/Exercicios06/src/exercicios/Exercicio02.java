package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> item = new ArrayList<>();

		operacoes(item);

	}

	public static void operacoes(List<String> item) {
		while (true) {
			System.out.println(
					"Escolha uma operacão: \n1 - Adicionar item \n2 - Listar items \n3 - Remover item selecionado \n4 - Sair do programa");
			
			int operacao = leia.nextInt();

			if (operacao == 1) {
				adicionar(item);

			} else if (operacao == 2) {
				listar(item);

			} else if (operacao == 3) {
				remover(item);

			} else if (operacao == 4) {
				System.out.println("Saindo do programa");
				break;

			} else {
				erro();
			}
		}
	}

	public static void remover(List<String> item) {
		if (item.size() == 0) {
			System.out.println("Não foi possível remover, pois não foi encontrado nenhum item na lista");
			System.out.println();
			
		} else {
			listar(item);
			System.out.println("Digite o número do item a ser removido da lista de compras: ");
			int numero = leia.nextInt() - 1;
			item.remove(numero);

			System.out.println("Item " + item.get(numero) + ", na posição " + (numero + 1) + " removido com sucesso");
		}
	}

	public static void listar(List<String> item) {
		if (item.size() == 0) {
			System.out.println("Nenhum item encontrado na lista. Primeiro adicione algum item");

		} else {
			System.out.println();
			System.out.println("Item\tNome");
			for (int i = 0; i < item.size(); i++) {
				System.out.println("#" + (i + 1) + "\t" + item.get(i));
			}
		}
		System.out.println();
	}

	public static void erro() {
		System.out.println("Erro de digitação");
	}

	public static void adicionar(List<String> item) {
		System.out.println("Digite o nome do item a ser adicionado na lista de compras: ");
		item.add(leia.next());
		System.out.println("Item adicionado");
		System.out.println();
	}

}
