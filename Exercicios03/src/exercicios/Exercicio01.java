package exercicios;

import java.util.Scanner;

public class Exercicio01 {

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
