package exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class CadastroAlunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String[] alunos = new String[50];
		alunos[0] = "Diogo";
		alunos[1] = "Heitor";
		alunos[2] = "Fabio";
		alunos[3] = "Milton";
		alunos[4] = "Maria";
		
		while (true) {
			
			System.out.println("--------------------------");
			System.out.println("Bem vindo");
			System.out.println("Digite 1 para cadastrar");
			System.out.println("Digite 2 para remover");
			System.out.println("Digite 3 para listar");
			System.out.println("Digite 4 para sair");
			int opcao = leia.nextInt();
			leia.nextLine(); // Limpeza do Buffer
			
			if (opcao == 1) {
				
				System.out.println("Digite o nome do aluno");
				String nome = leia.nextLine();
				
				for (int i = 0; i < alunos.length; i++) {					
					if (alunos[i] == null) {
						alunos[i] = nome;
						break;
					}					
				}
				
				
			} else if(opcao == 2) {
				
				System.out.println("Digite o nome "
						+ "do aluno que você quer remover: ");
				String nomeRemover = leia.nextLine();
				boolean encontrado = false;
				
				for (int i = 0; i < alunos.length; i++) {
					if ( alunos[i] != null &&   alunos[i].equals(nomeRemover)) {
						alunos[i] = null;
						encontrado = true;
						break;
					}	
					
					
									
				}
				
				if (encontrado == true) {
					System.out.println("Aluno removido com sucesso");
				} else {
					System.out.println("Aluno não encontrado");
				}
				
				
				
				
				
				
			} else if (opcao == 3) {
				
				for (int i = 0; i < alunos.length; i++) {					
					if (alunos[i] != null) {
						System.out.println(alunos[i]);
					}					
				}
				
				
			} else if (opcao == 4) {
				System.out.println("Saindo");
				break;
			} else {
				System.out.println("Opção inválida");
			}
			
			
			
			
		}
		
		
		
		

	}

}
