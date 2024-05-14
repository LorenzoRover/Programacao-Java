package exemplos;

public class ForEach {

	public static void main(String[] args) {
		
		int[] idades = {10,15,25,35,60};
		
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		for (int idade : idades ) {
			System.out.print(idade + " ");
		}
		
		System.out.println();
		String[] nomes = {"Fabio","Arthur","Anderson"};
		for (String nome : nomes) {
			System.out.print(nome + " ");
		}
		
		

	}

}
