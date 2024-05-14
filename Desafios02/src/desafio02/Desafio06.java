package desafio02;

import java.util.Scanner;

public class Desafio06 {
	
	/* Quilometragem de combustível Os motoristas se preocupam com a quilometragem obtida por seus
	automóveis. Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade
	de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba
	como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) para 3
	viagens. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a
	quilometragem total e a soma total de litros de combustível consumidos até esse ponto para todas as
	viagens. Todos os cálculos de média devem produzir resultados de ponto flutuante. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int combTotal = 0;
		int kmTotal = 0;

		System.out.println("Digite o km andado e o litro do combustível consumido para 3 viagens");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "ª Viagem");
			int km = leia.nextInt();
			int combustivel = leia.nextInt();

			double consumo = km / combustivel;
			System.out.println("Km por litro: " + consumo);

			combTotal = +combustivel;
			kmTotal = +km;
			System.out.println("Km e combustível utilizados até agora: \nKm = " + kmTotal + "\nCombustível = " + combTotal);
			
		}
		
		double media = kmTotal / combTotal;
		
		System.out.println("Média de Km por combustível: " + media);

	}

}
