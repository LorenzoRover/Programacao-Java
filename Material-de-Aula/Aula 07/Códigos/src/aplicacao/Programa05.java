package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Pessoa;

public class Programa05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		List<Pessoa> listaMenores = new ArrayList<>();
		
		System.out.println("Quantas pessoas você ira cadastrar?");
		int qtdPessoas = leia.nextInt();
		
		
		int menor16 = 0;
		double soma = 0;
		for (int i = 0; i < qtdPessoas; i++) {
			
			leia.nextLine();
			System.out.println("Pessoa " + (i+1));
			
			System.out.print("Nome: ");
			String nome = leia.nextLine();
			
			System.out.print("Idade: ");
			int idade = leia.nextInt();
			
			System.out.println("Altura: ");
			double altura = leia.nextDouble();
			
			System.out.println("Peso: ");
			double peso = leia.nextDouble();
			
			// Criando a pessoa
			Pessoa pessoa = new Pessoa(nome, altura, idade, peso);
			
			// Adicionando a pessoa na lista
			lista.add(pessoa);
			
			// Analisando se é menor de idade
			if (pessoa.ehMaiorDeIdade() == false) {
				menor16++;
				listaMenores.add(pessoa);				
			}
			
			// Calcular a soma das alturas
			soma = soma + pessoa.getAltura();				
		}
		
		// Calculando a média das alturas
		double media = soma/qtdPessoas;
		System.out.println("Média das alturas: " + media);
		double porcMenor = ( (double)  menor16/qtdPessoas)  * 100.0;
		System.out.println("Porcentagem de menores de idade: " + porcMenor);
		System.out.println(listaMenores);
		
		for (Pessoa pessoa: listaMenores) {
			System.out.println(pessoa.getNome());
		}
		
		
		
		
		

	}

}
