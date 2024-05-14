package desafio02;

import java.util.Scanner;

public class Desafio07 {

	/*
	 * Calculador de salários Desenvolva um aplicativo Java que determina o salário
	 * bruto de cada um de três empregados. A empresa paga as horas normais pelas
	 * primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as
	 * horas trabalhadas além das 40 horas. Você recebe uma lista de empregados, o
	 * número de horas trabalhadas por eles na semana passada e o salário-hora de
	 * cada um. Seu programa deve aceitar a entrada dessas informações para cada
	 * empregado e, então, determinar e exibir o salário bruto do empregado. Utilize
	 * a classe Scanner para inserir os dados.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do salário por hora e as horas trabalhadas pelos 3 funcionários: ");

		for (int i = 0; i < 3; i++) {
			
			double salarioReduzido = 0;
			
			System.out.println((i+1) + "º Funcionário: ");
			double salarioHora = leia.nextDouble();
			int hora = leia.nextInt();
			
			double salario = salarioHora * hora;
			
			if (hora > 40) {
				int horaAdicional = hora - 40;
				salarioReduzido = (salarioHora / 0.5) * horaAdicional;
			}
			
			double salarioFinal = salarioReduzido + salario;
			
			System.out.println("Salario final: " + salarioFinal);
			
		}

	}

}
