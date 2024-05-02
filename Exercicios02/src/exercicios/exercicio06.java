package exercicios;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite três notas do aluno: ");
		double nota1 = leia.nextDouble();
		double nota2 = leia.nextDouble();
		double nota3 = leia.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Aluno aprovado com a nota " + media);
		} else {
			System.out.println("Aluno reprovado com a nota " + media);
		}
	}

}
