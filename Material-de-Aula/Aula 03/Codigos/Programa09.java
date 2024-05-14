package exemplos;

public class Programa09 {

	public static void main(String[] args) {
			
		String palavra = "programador";
		
		for (int i = 0; i < palavra.length(); i++ ) {			
			char letra = palavra.charAt(i);	
			System.out.println("Posição " + i + 
					", Letra: " + letra);
			if (letra == 'a') {
				System.out.println("a encontrado na posição " + i);
			}			
		}
		
		

	}

}
