package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite o número de funcionários: ");
		int numero = leia.nextInt();

		List<Integer> id = new ArrayList<>();
		List<String> nome = new ArrayList<>();
		List<Double> salario = new ArrayList<>();

		adicionar(id, nome, salario, numero);
		operacoes(id, nome, salario);
	}

	public static void adicionar(List<Integer> id, List<String> nome, List<Double> salario, int numero) {

		for (int i = 0; i < numero; i++) {
			leia.nextLine();
			System.out.println("Digite o id, nome e salario do " + (i + 1) + "º funcionário: ");
			id.add(leia.nextInt());
			nome.add(leia.next());
			salario.add(leia.nextDouble());
		}
	}

	public static void operacoes(List<Integer> id, List<String> nome, List<Double> salario) {

		while (true) {
			System.out.println();

			System.out.println(
					"Escolha uma operacão: \n1 - Listar funcionários \n2 - Aumentar ou diminuir o salário de um funcionário \n3 - Sair do programa");
			int operacao = leia.nextInt();

			if (operacao == 1) {
				listar(id, nome, salario);

			} else if (operacao == 2) {
				modificarSalario(id, nome, salario);

			} else if (operacao == 3) {
				System.out.println("Saindo do programa");
				break;

			} else {
				erro();
			}
		}
	}

	public static void modificarSalario(List<Integer> id, List<String> nome, List<Double> salario) {
		System.out.println();
		listar(id, nome, salario);
		System.out.println("Escolha o número (não é o id) do funcionário para modificar seu respectivo salário: ");
		int funcionario = leia.nextInt() - 1;

		System.out.println("Digite o aumento do salário (em porcentagem): ");
		double porcentagem = leia.nextDouble();

		double novoSalario = ((salario.get(funcionario) * porcentagem) / 100) + salario.get(funcionario);
		salario.set(funcionario, novoSalario);
	}

	public static void listar(List<Integer> id, List<String> nome, List<Double> salario) {
		System.out.println();
		System.out.println("Funcionário\tID\t\tNome\t\t\tSalário");
		for (int i = 0; i < id.size(); i++) {
			System.out.println("#" + (i + 1) + "\t\t" + id.get(i) + "\t\t" + nome.get(i) + "\t\t\t" + salario.get(i));
		}
	}

	public static void erro() {
		System.out.println("Erro de digitação");
	}

}
