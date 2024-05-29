package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Programa01 {

	public static void main(String[] args) {
		
		// Inicializando uma lista 
		List<Integer> listaNumeros  = new ArrayList<>();
		
		// Inicializando uma lista com valores
		List<Integer> lista = new ArrayList<>(List.of(3,2,5));
		
		// Lista de Strings
		List<String> listaNomes = new ArrayList<>();
		
		// Adicionando valores
		listaNomes.add("Maria");
		listaNomes.add("Bob");
		listaNomes.add("Charlie");
		listaNomes.add("Meg");
		
		// imprimindo a lista
		System.out.println(listaNomes);
		
		// Buscando o elemento da posição 2
		String nome = listaNomes.get(2);
		System.out.println(nome);
		
		// Adicionando um elemento em uma posição especifica
		listaNomes.add(2,"Fabio");
		System.out.println(listaNomes);
		
		// Percorrendo uma lista
		for (int i = 0 ; i < listaNomes.size(); i++) {
			System.out.println("Posição " + i 
					+ ", elemento: " + listaNomes.get(i));
		}
		// For EACH
		for (String name: listaNomes) {
			System.out.println(name);
		}
		
		// Removendo pelo elemento
		listaNomes.remove("Fabio");
		System.out.println(listaNomes);
		
		// Removendo pela posição
		listaNomes.remove(1);
		System.out.println(listaNomes);
		
		// Lista de numeros
		System.out.println(lista);
		lista.remove(Integer.valueOf(5));   // remover pelo elemento
		System.out.println(lista);		
		
		// Removendo todos os nomes que comecem com M
		listaNomes.removeIf(i -> i.charAt(0) == 'M');
		System.out.println(listaNomes);
		
		// Atualizando elemento de uma posição especifica
		listaNomes.set(0, "Charles");
		System.out.println(listaNomes);
		
		listaNomes.add("Roberto");
		listaNomes.add("Fernanda");
		System.out.println(listaNomes);
		
		// Segunda lista de nomes
		List<String> listaNomes2 = new ArrayList<>();
		listaNomes2.add("Teste");
		listaNomes2.add("Testando");
		
		// Juntando em uma só
		listaNomes.addAll(listaNomes2);
		System.out.println(listaNomes);
		
		// Ordenação
		listaNomes.sort(null);
		System.out.println(listaNomes);
		
		// Encontrando o indice do elemento
		int indice = listaNomes.indexOf("Roberto");
		System.out.println("Roberto esta na posiçao " + indice);
		
		// Verificando existencia
		boolean existe = listaNomes.contains("Fernanda");
		System.out.println("Fernanda existe? " + existe);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
