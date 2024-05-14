package exemplos;

public class Programa02 {

	public static void main(String[] args) {
		
		// Inicializando o vetor
		String[] nomes = new String[5];
		
		// Inserindo valores no vetor
		nomes[1] = "Charlie";
		nomes[3] = "Bob";
//		nomes[5] = "Maria";  ERRO - Posicao 5 não existe
		
		String nomeIndividual = nomes[3];
		System.out.println(nomeIndividual);		
		System.out.println(nomes);
		System.out.println(nomes[1]);		
		System.out.println(nomes[2]);
		
		int comprimento = nomes.length;
		System.out.println("O comprimento do vetor  é " + comprimento);
		
		for (int i = 0; i < comprimento ; i++) {
			System.out.println("Posição " + i +
					" Valor: " + nomes[i]);
		}
		
		nomes[1] = "Maria";
		for (int i = 0; i < comprimento ; i++) {
			System.out.println("Posição " + i +
					" Valor: " + nomes[i]);
		}
		
		// Trocar maria e bob de posição
		String aux = nomes[1];
		nomes[1] = nomes[3];
		nomes[3] = aux;
		
		// Inicializando o vetor com valores
		int[] numeros = { 1, 5, 9, 10, 15, 19};
		for (int i = 0; i < numeros.length ; i++) {
			System.out.println("Posição " + i +
					" Valor: " + numeros[i]);
		}
		
		
		
		
		
		
		
		
		

	}

}
