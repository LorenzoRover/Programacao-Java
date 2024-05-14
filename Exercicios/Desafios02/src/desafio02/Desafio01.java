package desafio02;

import java.util.Scanner;

public class Desafio01 {
	
	/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste
	item. A seguir, calcule e mostre o valor da conta a pagar. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número do pedido e sua quantia: ");
		int codigo = leia.nextInt();

		if (codigo < 1 || codigo > 5) {
			System.out.println("Número inválido!");
		} else {
			int quantidade = leia.nextInt();
			double precoTotal = 0;
			
			switch (codigo) {

			case 1:
				precoTotal = 4 * quantidade;
				System.out.println("Número " + codigo + " | Cachorro Quente | Valor total: " + precoTotal);
				break;
			case 2:
				precoTotal = 4.5 * quantidade;
				System.out.println("Número " + codigo + " | X-Salada | Valor total: " + precoTotal);
				break;
			case 3:
				precoTotal = 5 * quantidade;
				System.out.println("Número " + codigo + " | X-Bacon | Valor total: " + precoTotal);
				break;
			case 4:
				precoTotal = 2 * quantidade;
				System.out.println("Número " + codigo + " | Torrada Simples | Valor total: " + precoTotal);
				break;
			case 5:
				precoTotal = 1.5 * quantidade;
				System.out.println("Número " + codigo + " | Refrigerante | Valor total: " + precoTotal);
				break;

			}
		}
	}

}
