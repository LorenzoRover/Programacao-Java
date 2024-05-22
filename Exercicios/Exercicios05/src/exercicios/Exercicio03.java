package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
	
	/* Crie uma função que gere uma senha aleatória para o usuário. */

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senhaGerada = "";
		String simbolos = "";
		
		gerarSenha(senhaGerada, simbolos);
	}

	private static void gerarSenha(String senhaGerada, String simbolos) {
		String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
		String letrasMinusculas = "abcdefghijklmnopqrstuvxwyz";
		String numeros = "0123456789";
		String caracter = "@#%&*";
		
		System.out.println("Qual o comprimento da senha? ");
		int comprimento = leia.nextInt();
		leia.nextLine();
		
		simbolos += OpcaoLetraMaiuscula(letrasMaiusculas);
		simbolos += OpcaoLetraMinuscula(letrasMinusculas);
		simbolos += OpcaoNumero(numeros);
		simbolos += OpcaoSimbolo(caracter);
		
		System.out.println(simbolos);
		
		Random aleatorio = new Random();
		for (int i = 0; i <= comprimento; i++) {
			
			int posicao = aleatorio.nextInt(0,simbolos.length());
			senhaGerada += simbolos.charAt(posicao);
			
		}
		
		System.out.println("Senha gerada: " + senhaGerada);
	}

	private static String OpcaoSimbolo(String caracter) {
		String simbolos = "";
		
		System.out.println("Você deseja na "
				+ "senha simbolos? [s/n]");
		char opcao4 = leia.nextLine().charAt(0);
		
		if(opcao4 == 's') {
			simbolos += caracter;
		}
		return null;
	}

	private static String OpcaoNumero(String numeros) {
		String simbolos = "";
		
		System.out.println("Você deseja na "
				+ "senha números? [s/n]");
		char opcao3 = leia.nextLine().charAt(0);
		
		if(opcao3 == 's') {
			simbolos += numeros;
		}
		return simbolos;
	}

	private static String OpcaoLetraMinuscula(String letrasMinusculas) {
		String simbolos = "";
		
		System.out.println("Você deseja na "
				+ "senha letras minusculas? [s/n]");
		char opcao2 = leia.nextLine().charAt(0);
		
		if(opcao2 == 's') {
			simbolos += letrasMinusculas;
		}
		return simbolos;
	}

	private static String OpcaoLetraMaiuscula(String letrasMaiusculas) {
		String simbolos = "";
		
		System.out.println("Você deseja na "
				+ "senha letras maiusculas? [s/n]");
		char opcao1 = leia.nextLine().charAt(0);
		
		if (opcao1 == 's') {
			simbolos += letrasMaiusculas;
		}
		return simbolos;
	}


}
