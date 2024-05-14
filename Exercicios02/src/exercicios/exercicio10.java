package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	
	/* Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) a partir do peso e altura
	informados pelo usuário, e informe a categoria de acordo com a tabela IMC. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe seu peso e altura: ");
		double peso = leia.nextDouble();
		double altura = leia.nextDouble();

		double imc = (peso / altura) / altura;

		if (imc > 60) {
			System.out.println("IMC: " + imc +". Obesidade grau V");
		} else if (imc > 50) {
			System.out.println("IMC: " + imc +". Obesidade grau IV");
		} else if (imc > 40) {
			System.out.println("IMC: " + imc +". Obesidade grau III");
		} else if (imc > 35) {
			System.out.println("IMC: " + imc +". Obesidade grau II");
		} else if (imc > 30) {
			System.out.println("IMC: " + imc +". Obesidade grau I");
		} else if (imc > 25) {
			System.out.println("IMC: " + imc +". Sobrepeso");
		} else if (imc > 18.5) {
			System.out.println("IMC: " + imc +". Peso normal");
		} else if (imc > 0 && imc < 18.5) {
			System.out.println("IMC: " + imc +". Abaixo do peso");
		} else {
			System.out.println("Erro!");
		}
	}

}
