package desafio02;

import java.util.Scanner;

public class desafio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da compra: ");
		double valor = leia.nextDouble();
		double valorTotal = 0;
		
		if (valor > 1000) {
			valorTotal = valor * 0.85;
			System.out.println("Valor total da compra: " + valorTotal + ". Desconto de 15%");
			
		} else if (valor > 500) {
			valorTotal = valor * 0.9;
			System.out.println("Valor total da compra: " + valorTotal + ". Desconto de 10%");
			
		} else if (valor >= 100) {
			valorTotal = valor * 0.95;
			System.out.println("Valor total da compra: " + valorTotal + ". Desconto de 5%");
			
		} else {
			System.out.println("Valor total da compra: " + valorTotal + ". Nenhum desconto aplicado");
			
		}
	}

}
