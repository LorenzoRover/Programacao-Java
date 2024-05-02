package desafio02;

import java.util.Scanner;

public class desafio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor com duas casas decimais: ");
		double valor = leia.nextDouble();
		double imposto = 0;
		
		if (valor > 4500) {
			imposto = valor * 0.28;
			
		} else if (valor > 3000) {
			imposto = valor * 0.18;
			
		} else if (valor > 2000) {
			imposto = valor * 0.08;
			
		} else {
			imposto = 0;
		}
		
		System.out.println("Valor do imposto a ser pago: " + imposto);
	}

}
