package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Pessoa;

public class Exercicio02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite o número de pessoas");
		List<Pessoa> pessoas = new ArrayList<>(leia.nextInt());

		cadastrarPessoa(pessoas);
		mediaDeAltura(pessoas);
		pessoasDeMenor(pessoas);

	}

	private static void pessoasDeMenor(List<Pessoa> pessoas) {
		double soma = 0;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 18) {
				soma++;
			}
		}

		double porcentagemMenorDeIdade = (soma / pessoas.size()) * 100;
		System.out.println("Porcentagem de menores de idade: " + porcentagemMenorDeIdade + "%");

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 18) {
				pessoa.toString();
			}
		}
	}

	private static void mediaDeAltura(List<Pessoa> pessoas) {
		double soma = 0;
		for (Pessoa pessoa : pessoas) {
			soma += pessoa.getAltura();
		}

		double media = soma / pessoas.size();
		System.out.println("Média de altura: " + media);
	}

	private static void cadastrarPessoa(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome: ");
			String nome = leia.nextLine();
			System.out.println("Idade: ");
			int idade = leia.nextInt();
			System.out.println("Altura: ");
			double altura = leia.nextDouble();
			leia.nextLine();

			Pessoa adicionarPessoa = new Pessoa(nome, idade, altura);
			pessoas.add(adicionarPessoa);
		}
	}

}
