package exemplos;

import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		String[] palavras = {"teclado", "mouse", "computador", "programador"};
		int sortear = aleatorio.nextInt(palavras.length);		
		String palavraSecreta = palavras[sortear];
		int maxTentativas = 6;
		int tentativas = 0;
		StringBuilder palavra = new StringBuilder();
		String letrasDigitadas = "";
		
		for (int i = 0; i < palavraSecreta.length(); i++ ) {
			palavra.append("_");
		}
		
		while (true) {
			
			boolean acertou = false;
			System.out.println(palavra);
			System.out.println("Letras já digitadas: " + letrasDigitadas);
			System.out.println("Digite uma letra: ");			
			char letra = leia.nextLine().charAt(0);
			
			String letraa = String.valueOf(letra);
			if (letrasDigitadas.contains(letraa)) {
				System.out.println("Letra já digitada");
			} else {
				letrasDigitadas += letra + " ";
				
				for (int i = 0; i < palavraSecreta.length(); i++  ) {				
					if (letra == palavraSecreta.charAt(i)) {
						palavra.setCharAt(i, letra);
						acertou = true;
						
						
					}				
				}
				
				
				
				if (acertou == false) {
					tentativas++;
				}			
				
				if (palavraSecreta.equals(palavra.toString())) {
					System.out.println(palavra);
					System.out.println("Você ganhou");
					
					System.out.println("Deseja jogar novamente?  [s/n]");
					char jogar = leia.nextLine().toLowerCase().charAt(0);
					if (jogar == 's') {
						tentativas = 0;
						sortear = aleatorio.nextInt(palavras.length);		
						palavraSecreta = palavras[sortear];
						palavra = new StringBuilder();
						letrasDigitadas = "";
						
						for (int i = 0; i < palavraSecreta.length(); i++ ) {
							palavra.append("_");
						}						
					} else {
						break;
					}
					
					
				}
				
				if ( tentativas == maxTentativas) {
					System.out.println("Que pena. Você perdeu. "
							+ "A palavra era: " + palavraSecreta);
					break;
				}
				
			}		
			
			
			
			
		}
		
		
		
		
		
		
		
		// Passo 1 : while ()
		//			boolean acertou = false;
		//	Passo 2: Mensagem para digitar uma letra e scanner capturar
		//  Passo 3: for percorrer a palavraSecreta e ver se a letra contem
						// if (letra == palavraSecreta.chatAt(i))
							// palavra.setChatAt(i,letra)
							// acertou = true;	
		// Passo 4 (Fora do for):  if (acertou == false)
									//	tentativas++
		// Passo 5:  analisar se ganhei
					// comparar palavraSecreta com palavra
		// Passo 6: analisar se perdi
					// comparar tentativas com maxTentativas
		// FIM do  while
		

	}

}
