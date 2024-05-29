package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Produto;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
		List<Produto> produtos = new ArrayList<>();
		
		for (int i =0; i < 3 ; i++) {			
			System.out.println("Produto " + (i+1));
			System.out.print("Nome: ");
			String nome = leia.nextLine();
			System.out.print("Preço: ");
			double preco = leia.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = leia.nextInt();
			leia.nextLine();			
			Produto produto = new Produto(nome,preco,quantidade);
			produtos.add(produto);
			
		}		
		
		// FOR EACH para mostrar as caracteristicas do produto
		for (Produto produto:  produtos) {			
			System.out.println(produto);
		}
		
		// Pegar um produto em especifico
		Produto produto = produtos.get(0);
		System.out.println("Digite a quantidade a adicionar no estoque");
		int quantidade = leia.nextInt();
		produto.adicionarEstoque(quantidade);
		System.out.println(produto);
		
		System.out.println("Digite a quantidade a remover no estoque");
		quantidade = leia.nextInt();
		produto.removerEstoque(quantidade);
		System.out.println(produto);
		

	}

}
