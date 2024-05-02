package exercicios;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Lance dois dados: ");
		int dado1 = leia.nextInt();
		int dado2 = leia.nextInt();
		int somaDados = dado1 + dado2;

		switch (somaDados) {

		case 7:
			System.out.println("Você venceu");
			break;
		case 11:
			System.out.println("Você venceu");
			break;
		case 2:
			System.out.println("Você perdeu");
			break;
		case 3:
			System.out.println("Você perdeu");
			break;
		case 12:
			System.out.println("Você perdeu");
			break;
		default:
			System.out.println("Nenhum valor correspondente");

		}
	}

}
