package exemplos;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		int dia = leia.nextInt();
		
		switch (dia) {
		case 2:
			System.out.println("Segunda");
			break;
		case 1:
			System.out.println("Domingo");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Numero inválido. Digite de 1 a 7");
				
		}
		
		if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda");
		} else if (dia == 3) {
			System.out.println("Terça");
		} else if (dia == 4) {
			System.out.println("Quarta");
		} else if (dia == 5) {
			System.out.println("Quinta");
		} else if (dia == 6) {
			System.out.println("Sexta");
		} else if (dia == 7) {
			System.out.println("Sabado");
		} else {
			System.out.println("Numero inválido. Digite de 1 a 7");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
