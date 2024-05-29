package aplicacao;

import java.sql.Connection;
import java.sql.Date;

import dao.ProdutoDao;
import entidades.Produto;

public class SistemaProduto {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ProdutoDao dao = new ProdutoDao();
		Connection conn = dao.getConexao();
		
		
		Date data = Date.valueOf("2024-05-28");
		
		Produto produto = 
				new Produto("Teclado", "Intelbras", 50, 100, data, "Periféricos");
		
		int id = dao.inserirProduto(produto);
		
		
	}

}
