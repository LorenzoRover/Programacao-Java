package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos quartos serão alugados? ");
		int N = leia.nextInt();
		
		String[] nomes = new String[10];
		String[] emails = new String[10];		
		
		for (int i = 0; i < N; i++) {
			
			System.out.println("Aluguel #"+(i+1));
			System.out.println("Quarto: ");
			int quarto = leia.nextInt() -1;
			
			if (nomes[quarto] == null) {				
				leia.nextLine(); // Limpeza de buffer				
				System.out.println("Nome: ");
				nomes[quarto] = leia.nextLine();				
				System.out.println("Email: ");
				emails[quarto] = leia.nextLine();
			} else {
				System.out.println("Quarto indisponivel");
				i--;
			}
			
			
			
					
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (nomes[i] != null) {
				System.out.println((i+1)+": "  + nomes[i]+ ", " + emails[i] );
			}
		}

	}

}
