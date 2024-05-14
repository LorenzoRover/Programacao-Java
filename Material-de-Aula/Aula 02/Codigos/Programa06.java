package exemplos;

public class Programa06 {

	
	
	public static void main(String[] args) {	
		
		// ESCOPO DE VARIAVEL
		int numero = 10;
		
		if ( numero > 0) {
			int segundoNum = 15;
			int soma = numero + segundoNum;	
			System.out.println("A soma deu " + soma);
		}
		
		// Não existe a variavel soma neste escopo
//		System.out.println("A soma deu " + soma); // ERRO
		
		
		
		
		
		
		

	}

}
