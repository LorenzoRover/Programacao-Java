package desafio02;

import java.util.Scanner;

public class Desafio04 {
	
	/* Em um país imaginário, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele
	não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
	qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas
	decimais, equivalente ao salário de uma pessoa. Em seguida, calcule e mostre o valor que esta pessoa
	deve pagar de Imposto de Renda, segundo a tabela abaixo:
	Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a
	faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido
	(abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
	valor deve ser impresso com duas casas decimais. */

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
