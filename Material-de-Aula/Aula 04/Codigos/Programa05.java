package exemplos;

public class Programa05 {
	
	public static void main(String[] args) {
		
		int valor = 570;
		int[] cedulas = {100,50,20,10,5,2};
		
		for (int nota : cedulas   ) {		
			int quantidade = valor/nota;
			valor = valor - (quantidade * nota);
			
			System.out.println("Notas de R$" + nota + ": "
			+ quantidade);
			
		}
		
		
	}

}
