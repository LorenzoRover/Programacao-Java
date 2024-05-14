package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	
	/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
	Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool
	2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
	solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado
	for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO"e a quantidade de clientes que
	abasteceram cada tipo de combustível, conforme exemplo. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número do combustível: ");
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (true) {
			int numero = leia.nextInt();
			if (numero == 1) {
				System.out.println("ÁLCOOL");
				alcool++;
			} else if (numero == 2) {
				System.out.println("GASOLINA");
				gasolina++;
			} else if (numero == 3) {
				System.out.println("DIESEL");
				diesel++;
			} else if (numero == 4) {
				System.out.println("Muito obrigado!");
				break;
			} else {
				System.out.println("Número inválido");
			}
		}

		System.out.println("Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);

	}

}
