package exemplos;

import java.util.Random;

public class Programa06 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		// Gerando numero aleatorio
		int numero = aleatorio.nextInt();
		System.out.println("O numero gerado foi : " + numero);	
		
		numero = aleatorio.nextInt(100);
		System.out.println("O numero gerado foi : " + numero);
		
		numero = aleatorio.nextInt(100)  + 100;
		System.out.println("O numero gerado foi : " + numero);
		
		numero = aleatorio.nextInt(100,200);
		System.out.println("O numero gerado foi : " + numero);
		
		// Gerador de senha
		String simbolos = "abcdefghij012345";
		int comprimento = simbolos.length();
		System.out.println("Comprimento da String: " + comprimento);
		
		int posicao = aleatorio.nextInt( comprimento  );
		char caracter = simbolos.charAt(posicao);
		
		System.out.println("Posição gerada " + posicao +   ", Caracter selecionado " 
		+ caracter);
		
		
		
		
		
		
		
		
	}

}
