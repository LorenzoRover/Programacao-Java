package desafio02;

import java.util.Scanner;

public class Desafio05 {
	
	/* Simule as operações de um caixa eletrônico. O programa deve oferecer diversas opções, e o usuário
	poderá escolher entre:
	• Consultar Saldo
	• Sacar Dinheiro
	• Depositar Dinheiro
	• Transferir Dinheiro
	• Encerrar */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Opções do banco: \n"
				+ "   1-Consultar Saldo \n"
				+ "   2-Sacar Dinheiro \n"
				+ "   3-Depositar Dinheiro \n"
				+ "   4-Transferir Dinheiro \n"
				+ "   5-Encerrar");
		
		int opcao = leia.nextInt();
		double saldo = 5500;
		double valorRestante = saldo;
		
		switch (opcao) {
		
		case 1:
			System.out.println("Saldo: " + saldo);
			break;
		case 2:
			System.out.println("Informe o valor a ser sacado: ");
			double saque = leia.nextDouble();
			valorRestante = saldo - saque;
			break;
		case 3:
			System.out.println("Informe o valor a ser depositado: ");
			double deposito = leia.nextDouble();
			valorRestante = saldo + deposito;
			break;
		case 4:
			System.out.println("Informe o valor a ser transferido: ");
			double transferencia = leia.nextDouble();
			valorRestante = saldo - transferencia;
			break;
		case 5:
			System.out.println("Programa encerrado");
		}
		
		if (opcao != 1 && opcao != 5) {
		System.out.println("Valor restante na conta: " + valorRestante);
		}
		
	}

}
