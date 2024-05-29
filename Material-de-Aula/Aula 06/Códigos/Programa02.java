package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Programa02 {

	public static void main(String[] args) {
		
		List<String>[] vetorDeListas = new ArrayList[26];
		
		// Inicializando uma lista em cada posição do vetor
		for (int i = 0; i < vetorDeListas.length; i++) {			
			vetorDeListas[i] = new ArrayList<>();
		}
		
		adicionarNome(vetorDeListas, "Anderson");
		adicionarNome(vetorDeListas, "Daniel");
		adicionarNome(vetorDeListas, "Davi");
		adicionarNome(vetorDeListas, "Camila");
		adicionarNome(vetorDeListas, "Bob");
		adicionarNome(vetorDeListas, "Charlie");
		adicionarNome(vetorDeListas, "Bernardo");
		adicionarNome(vetorDeListas, "Bianca");
		adicionarNome(vetorDeListas, "Andre");
		adicionarNome(vetorDeListas, "Cleberson");
		adicionarNome(vetorDeListas, "Eduardo");
		
		for (int i  = 0; i < vetorDeListas.length; i++) {
			char letra =  ((char) ('A' + i));
			System.out.println("Nomes da letra "
			+ letra + " : " + vetorDeListas[i]);			
		}
		
		
	}
	
	public static void adicionarNome(List<String>[] vetor, String nome) {
		
		char letra = nome.charAt(0);
		int indice = letra - 'A';
		vetor[indice].add(nome);
		
	}
	

}
