package exemplos;

// Trabalhando com formatação
public class Programa02 {

	public static void main(String[] args) {
		
		// Concatenação (+)
		String nome = "Rogerio";
		System.out.println("O nome do professor é: " +  nome);
		
		
		// Tipos primitivos
		int numero = 10;
		Integer num = 10;
		String num1 = "10";
		int num2 = Integer.parseInt(num1);		
		System.out.println(num2 + num); // 20
		System.out.println(num1 + numero); // 1010
		
		
		String produto = "Teclado";
		double preco = 50.99;
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Produto adquirido: " + produto);
		System.out.println("Preço unitario do produto: R$" + preco);			
		System.out.println("Preço unitario do " + produto + ": R$" + preco);
		
		String sobreNome = "Pereira";
		System.out.println(nome+  " "+ sobreNome);
		
		// printf
		// %n - quebra de linha
		// %f - tipo double
		// %s - tipo String
		// %d - tipo int
		
		preco = 48.254796138547;
		System.out.printf("O preco do produto é: R$%.2f%n", preco );		
		System.out.printf("O preco do %s é: R$%.2f%n",produto, preco);
		
		
		
		
		

	}

}
