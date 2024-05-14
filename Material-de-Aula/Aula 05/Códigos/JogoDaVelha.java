package exemplos;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];
		char jogadorAtual = 'X';
		jogar(jogadorAtual,tabuleiro);		

	}

	private static void jogar(char jogadorAtual, char[][] tabuleiro) {
		
		Scanner leia = new Scanner(System.in);
		inicializarTabuleiro(tabuleiro);
		boolean jogoRolando = true;
		
		while (jogoRolando == true) {
			
			mostrarTabuleiro(tabuleiro);
			System.out.println("Jogador: " + jogadorAtual 
					+ ", digite a linha e a coluna");
			int linha = leia.nextInt() -1;
			int coluna = leia.nextInt() -1;
			
			if (linha >=0 && linha < 3 && coluna >=0 && coluna < 3 
					&& tabuleiro[linha][coluna] == ' ') {
				
				// Inserindo valor no tabuleiro
				tabuleiro[linha][coluna] = jogadorAtual;
				
				
				
				if (verificarVitoria(tabuleiro,jogadorAtual)  == true    ) {
					
					mostrarTabuleiro(tabuleiro);
					System.out.println("Jogador " + jogadorAtual + " venceu!");
									
					leia.nextLine();  // Limpeza buffer
					System.out.println("Você deseja jogar novamente? [s/n]");
					char opcao = leia.nextLine().toLowerCase().charAt(0);
					if (opcao == 's') {
						inicializarTabuleiro(tabuleiro);
					} else {
						jogoRolando = false;
						System.out.println("Jogo encerrado");
					}
					
					
				} else if (verificarEmpate(tabuleiro) == true ) {
					
					mostrarTabuleiro(tabuleiro);
					System.out.println("Empate");
					jogoRolando = false;
					
				}
				
				// Trocando de jogador
				if (jogadorAtual == 'X' ) {
					jogadorAtual = 'O';
				} else {
					jogadorAtual = 'X';
				}
				
				
				
				
			} else {
				System.out.println("Jogada inválida. Tente novamente");
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	private static boolean verificarEmpate(char[][] tabuleiro) {
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {				
				if (tabuleiro[i][j] == ' ') {
					// significa que o jogo não acabou
					return false;
				}
			}
		}	
		return true;
	}

	private static boolean verificarVitoria(char[][] tabuleiro, char jogadorAtual) {
		
		// Diagonais
		if (tabuleiro[0][0] == jogadorAtual 
				&& tabuleiro[1][1] == jogadorAtual
				&& tabuleiro[2][2] == jogadorAtual) {
			return true;
		}
		
		if (tabuleiro[2][0] == jogadorAtual 
				&& tabuleiro[1][1] == jogadorAtual
				&& tabuleiro[0][2] == jogadorAtual) {
			return true;
		}
		
		// Verificando linhas
		for (int i = 0; i < 3; i++) {			
			if (tabuleiro[i][0] == jogadorAtual
					&& tabuleiro[i][1] == jogadorAtual
					&& tabuleiro[i][2] == jogadorAtual) {	
				return true;
			}				
		}
		
		// Verificando colunas
		for (int j = 0; j < 3; j++) {			
			if (tabuleiro[0][j] == jogadorAtual
					&& tabuleiro[1][j] == jogadorAtual
					&& tabuleiro[2][j] == jogadorAtual) {	
				return true;
			}				
		}
		
		
		
		
		
		
		
		return false;
	}

	public static void inicializarTabuleiro(char[][] tabuleiro) {
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {				
				tabuleiro[i][j] = ' ';
			}
		}
	}
	
	public static void mostrarTabuleiro(char[][] tabuleiro) {
		
		for (int i = 0; i < 3; i++) {
			for (int j=0;  j < 3; j++) {
				System.out.print(tabuleiro[i][j]);
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("--+---+---");
			}			
		}
		
	}
	
	
	

}
