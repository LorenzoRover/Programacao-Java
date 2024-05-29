package entidade;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	// Construtor
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		System.out.println("OBJETO CRIADO COM SUCESSO");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		
		if (preco < 0) {
			System.out.println("Valor inválido");
		} else {
			this.preco = preco;
		}
		
		
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}





	public double precoTotal() {
		return preco * quantidade;
	}
	
	public void adicionarEstoque(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", precoTotal()="
				+ precoTotal() + "]";
	}
	
	
	
	
	



}
