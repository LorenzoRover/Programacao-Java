package aplicacao;

import entidade.Produto;

public class Programa04 {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Teclado", 70, 100);
		
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preço " + produto.getPreco());
		
	
		
		produto.setPreco(50);
		System.out.println("Preço: " + produto.getPreco());
		
		Produto produto1 = new Produto("Mouse", 20, 50);
	}

}
