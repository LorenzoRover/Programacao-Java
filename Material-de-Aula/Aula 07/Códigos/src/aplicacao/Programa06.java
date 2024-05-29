package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionario;

public class Programa06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcionarios: ");
		int qtdFunc = leia.nextInt();
		
		for (int i = 0; i <qtdFunc; i++ ) {
			
			System.out.println("Funcionario " + (i+1));
			System.out.print("Id: ");
			int id = leia.nextInt();
			leia.nextLine(); // Limpeza de buffer
			
			// Verificar se já existi
			if (verificarExistencia(lista,id) == false) {
				
				System.out.print("Nome: ");
				String nome = leia.nextLine();
				System.out.print("Salario: ");
				double salario = leia.nextDouble();
				
				// Criar meu objeto
				Funcionario funcionario = new Funcionario(id, nome, salario);
				
				// Adicionar o funcionario na lista
				lista.add(funcionario);	
				
			} else {
				System.out.println("Funcionario já existente");
				i--;
			}
			
			
			
						
		}
		
		
		System.out.println("Digite o id do funcionario que tera aumento: ");
		int id = leia.nextInt();
		
		for (Funcionario func : lista) {
			
			if (func.getId() == id) {
				System.out.println("Digite a porcentagem do aumento:");
				double porcentagem = leia.nextDouble();				
//				double salarioAtual = func.getSalario();
//				double novoSalario = salarioAtual + (salarioAtual * porcentagem/100.0);
//				func.setSalario(novoSalario);					
				func.aumentoSalario(porcentagem);
			}
			
			
		}
		
		
		
		for (Funcionario func : lista) {
			System.out.println(func);		
		}
		

	}
	
	
	public static boolean verificarExistencia(List<Funcionario> lista, int id) {
		
		for (Funcionario func : lista) {			
			if (func.getId() == id) {				
				return true;
			}
		}		
		return false;
	}
	

}
