package aplicacao;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.ProdutoDao;
import entidades.Produto;

public class SistemaProduto {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ProdutoDao dao = new ProdutoDao();
		
		
		Date data = Date.valueOf("2024-05-28");
		
		Produto produto = 
				new Produto("Monitor", "LG", 800, 20, data, "Informática");
		
		// inserir produto
//		int id = dao.inserirProduto(produto);
//		System.out.println("ID: " + id);
		
		
		// Select dos produtos e colocando numa lista
		List<Produto> lista = dao.listarProdutos();
		for (Produto product : lista) {
			System.out.println(product);
		}
		
		// Deletar
		dao.deletarProduto(1);		
		
		// Atualizar
		produto = lista.get(1);
		produto.setMarca("Positivo");
		produto.setPreco(1.99);
		dao.atualizarProduto(produto);
		
		System.out.println("Depois da atualização");
		lista = dao.listarProdutos();
		for (Produto product : lista) {
			System.out.println(product);
		}
		
		System.out.println("PESQUISA POR ID");
		// pesquisar por id
		produto = dao.pesquisarPorId(3);
		
		if (produto != null) {
			System.out.println(produto.getNome());
		} else {
			//redirect:index.html()
		}
		
		
		
		
	}

}
