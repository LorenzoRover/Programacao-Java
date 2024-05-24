package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionario;

public class Exercicio01 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o número de funcionários: ");
		List<Funcionario> funcionarios = new ArrayList<>(leia.nextInt());
		
		adicionarFuncionario(funcionarios);
		aumentoSalario(funcionarios);
		mostrarFuncionarios(funcionarios);
	}

	private static void mostrarFuncionarios(List<Funcionario> funcionarios) {
		for (Funcionario funcionario : funcionarios) {
			funcionario.toString();
		}
	}

	private static void aumentoSalario(List<Funcionario> funcionarios) {
		System.out.println("Digite o ID do funcionário: ");
		int numero = leia.nextInt();
		
		for (Funcionario funcionario : funcionarios) {
			while (true) {
				if (funcionario.getId() == numero) {
					
					System.out.println("Digite a porcentagem do aumento salarial: ");
					double porcentagem = leia.nextDouble();
					funcionario.aumentarSalario(porcentagem);
					break;
					
				} else {
					System.out.println("Erro");
				}
			}
		}
	}

	private static void adicionarFuncionario(List<Funcionario> funcionarios) {
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println((i+1) + "º Funcionário");
			System.out.println("ID: ");
			int id = leia.nextInt();
			System.out.println("Nome: ");
			String nome = leia.nextLine();
			System.out.println("Salário");
			double salario = leia.nextDouble();
			leia.nextLine();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		}
	}
	
	

}
