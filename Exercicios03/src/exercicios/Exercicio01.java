package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
	senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
	corretamente deve ser impressa a mensagem "Acesso Permitido"e o algoritmo encerrado. Considere que
	a senha correta é o valor 2002 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a senha para fazer login: ");
		
		while (true) {
			int senha = leia.nextInt();
			
			if (senha==2002) {
				System.out.println("Acesso permitido");
				break;
			}
			
			System.out.println("Senha inválida");
		}
	}

}
