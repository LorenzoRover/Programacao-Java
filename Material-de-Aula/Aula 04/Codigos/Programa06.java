package exemplos;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade"
				+ " de alunos que você quer registrar: ");
		int numAlunos = leia.nextInt();
		String[] nomes = new String[numAlunos];
		double[] nota1 = new double[numAlunos];
		double[] nota2 = new double[numAlunos];
		
		// Preenchimento do cadastro
		for (int i = 0; i < numAlunos; i++) {
			// Limpeza de Buffer
			leia.nextLine();	
			
			System.out.println("Digite o nome do "
			+ (i+1) + "° aluno: ");
			nomes[i] = leia.nextLine();
			
			System.out.println("Digite a primeira nota do aluno " 
			+ nomes[i] + ":");
			nota1[i] = leia.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno " 
					+ nomes[i] + ":");
			nota2[i] = leia.nextDouble();
			
		}
		
		
		System.out.println("Nome\t\t\tNota1\tNota2\tMédia\tSituação");
		
		for (int i = 0; i < numAlunos; i++) {
			
			double media = (nota1[i] + nota2[i])/2.0;
			String situacao;
			if (media >= 6) {
				situacao = "Aprovado";
			} else {
				situacao = "Reprovado";
			}
			System.out.println(nomes[i]+"\t\t\t"+nota1[i]
					+"\t"+nota2[i]+"\t"+media+"\t"+situacao);
			
		}
		
		
		
		
		
				
		
		

	}

}
