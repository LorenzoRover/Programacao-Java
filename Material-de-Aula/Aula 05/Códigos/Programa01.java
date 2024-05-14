package exemplos;

import java.util.Arrays;

public class Programa01 {
	
	public static void main(String[] args) {	
		int numero1 = 5;
		int numero2 = 10;
		
		int res = somar(numero1, numero2);	
		System.out.println("Resultado " + res);	
		
		somar(numero1, numero2,20);	
		System.out.println("Resultado " + res);	
		
		
		int[] vetor = {1,7,15,29,32,57,81,96,125,136,70};
		int numeroEncontrar = 125;			
		int indice = buscaLinear(vetor, numeroEncontrar);
		System.out.println("Posição: " + indice);
		
		
		
		
		
		
	}	
	public static int somar(int num1 ,int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	public static void somar(int num1 ,int num2, int num3) {
		int resultado = num1 + num2 + num3;
		System.out.println("Resultado: " + resultado);		
	}
	
	public static int buscaLinear(int[] vetor, int numero) {				
		int indiceEncontrado = -1;		
		for (int i = 0; i < vetor.length; i++) {			
			if (vetor[i] == numero) {
				indiceEncontrado = i;
				break;
			}
		}		
		return indiceEncontrado;
	}
	
	
	
	
	
	
	
	

}
