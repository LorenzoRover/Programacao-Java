package exemplos;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// nextLine captura o texto até encontrar a quebra de linha (ENTER)
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine(); 
		System.out.println("Bem vindo " + nome);
		
		// next captura até encontrar um caracter de espaço
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Bem vindo " + nome);
		
		// Limpeza de Buffer
		leia.nextLine();
		System.out.println("Digite sua idade");
		int idade = leia.nextInt();
		System.out.println("Sua idade " + idade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
		

	}

}
