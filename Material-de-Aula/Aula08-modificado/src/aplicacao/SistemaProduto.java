package aplicacao;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.ProdutoDao;
import entidades.Produto;

public class SistemaProduto {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		ProdutoDao dao = new ProdutoDao();
		Connection conn = dao.getConexao();
		
		Date data = Date.valueOf("2024-05-28");
		
		Produto produto = new Produto("Teclado", "Intelbras", 50, 100, data, "Periféricos");
		
		int id = dao.inserirProduto(produto);
		
		List<Produto> lista = dao.listarProdutos();
		for (Produto product : lista) {
			System.out.println(product);
		}
		
		produto = dao.pesquisarPorId(3);
		System.out.println(produto);
	}

}
