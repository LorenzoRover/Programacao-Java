package exemplos;

import java.util.Random;
import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		Scanner leia = new Scanner(System.in);
		
		int numeroAleatorio = aleatorio.nextInt(100);
		int tentativas = 0;
		System.out.println("Numero sorteado!!....");
		System.out.println("Digite sua tentativa");
		while (true) {
			
			int tentativa = leia.nextInt();
			leia.nextLine();
			
			if (tentativa == numeroAleatorio) {
				tentativas++;
				System.out.println("Parabéns você ganhou");
				break;
			} else if ( tentativa >  numeroAleatorio) {
				tentativas++;
				System.out.println("Digite um numero menor");
			} else {
				tentativas++;
				System.out.println("Digite um número maior");
			}	
			
			if (tentativas == 5) {
				System.out.println("Que pena voce perdeu");
				System.out.println("Quer jogar novamente? [s/n]");
				char letra = leia.nextLine().charAt(0);
				if (letra == 'n') {
					break;
				}	else {
					numeroAleatorio = aleatorio.nextInt(100);
					tentativas = 0;
				}
			}
			
			
			
		}
		
		System.out.println("Numero de tentativas: " + tentativas);

		
		
		
	}

}
