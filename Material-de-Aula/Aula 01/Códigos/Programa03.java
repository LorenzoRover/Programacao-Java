package exemplos;

// Trabalhando com Strings
public class Programa03 {

	public static void main(String[] args) {
		
		
		String texto = "Hello, World";
		int comprimento = texto.length();
		System.out.println("O comprimento da String é " + comprimento);
		
		String novoTexto = texto.replace('l', 'z');
		System.out.println("Texto modificado: " + novoTexto);
		
		String palavra = "Java";
		int posicao = 0;
		char letra = palavra.charAt(posicao);
		System.out.println("A primeira letra é " + letra);
		
		// Fatiamento
		String subString = texto.substring(7);
		System.out.println(subString);
		String subString2 = texto.substring(0,5);
		System.out.println(subString2);
		
		// Tudo minusculo ou maiusculo
		String frase = "Programador JAVA";
		String emMinusculas = frase.toLowerCase();
		String emMaiusculas = frase.toUpperCase();
		System.out.println(emMinusculas);
		System.out.println(emMaiusculas);
		
		// Retirar espaços em braco
		String nome = "        Rogerio          ";
		System.out.println(nome);
		nome = nome.trim();
		System.out.println(nome);
		
		// Igualdade
		String senha = "admin";
		String tentativa = "adminn";
		boolean acesso = senha.equals(tentativa);
		System.out.println("Acesso liberado? " + acesso);
		
		// Contém a String especifica?
		texto = "Programador Java";
		boolean contemJava = texto.toLowerCase().contains("java");
		System.out.println("Contem a palavra java? " + contemJava);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
