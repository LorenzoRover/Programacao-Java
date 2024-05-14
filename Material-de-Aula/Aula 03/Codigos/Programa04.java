package exemplos;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Bem vindo");

		double totalConta = 0;
		int escolha = 0;
		while (escolha != 4) {
			System.out.println("1. Pizza (R$ 25.00)");
			System.out.println("2. Hamburguer (R$ 15.00)");
			System.out.println("3. Refrigerante (R$ 5.00)");
			System.out.println("4. Finalizar pedido");
			System.out.println("Escolha uma opção (1, 2, 3 ou 4");
			escolha = leia.nextInt();

			if (escolha == 1) {
				System.out.println("Pizza adicionada com sucesso");
				totalConta += 25;
			} else if (escolha == 2) {
				System.out.println("Hamburguer adicionado com sucesso");
				totalConta += 15;
			} else if (escolha == 3) {
				System.out.println("Refrigerante adicionado com sucesso");
				totalConta += 5;
			} else if (escolha == 4) {
				System.out.println("Pedido finalizado!");
				System.out.println("Total a pagar: R$" + totalConta);
			} else {
				System.out.println("Opção inválida!");
			}

		}

	}

}
