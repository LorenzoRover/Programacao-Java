package desafio02;

import java.util.Scanner;

public class Desafio03 {
	
	/* Imagine que você está construindo um sistema de pagamento para um aplicativo de compras online. O
	sistema oferece descontos progressivos com base no valor total da compra. Aqui estão as regras:
	• Se o valor total da compra for inferior a R$ 100, não há desconto.
	• Se o valor total da compra for entre R$ 100 e R$ 500 (inclusive), há um desconto de 5%.
	• Se o valor total da compra for entre R$ 501 e R$ 1000 (inclusive), há um desconto de 10%.
	• Se o valor total da compra for superior a R$ 1000, há um desconto de 15% 
	O desafio é criar um programa em Java que solicita ao usuário o valor total da compra e, com base nas
	regras acima, calcula e exibe o valor final a ser pago, considerando os descontos aplicáveis. */

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
