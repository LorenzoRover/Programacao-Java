package exemplos;

public class BuscaLinear {

	public static void main(String[] args) {
		
		int[] vetor = {1,7,15,29,32,57,81,96,125,136,70};
		
		int numeroEncontrar = 96;		
		int indiceEncontrado = -1;
		
		for (int i = 0; i < vetor.length; i++) {			
			if (vetor[i] == numeroEncontrar) {
				indiceEncontrado = i;
				break;
			}
		}
		
		if (indiceEncontrado != -1) {
			System.out.println("O numero " + numeroEncontrar
					+ " esta na posição " + indiceEncontrado);			
		} else {
			System.out.println("O numero " + numeroEncontrar
					+ " não está presente no vetor");			
		}
		

	}

}
