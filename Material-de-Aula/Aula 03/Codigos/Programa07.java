package exemplos;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Programa07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String login = "admin";
		String senha = "root";

		int tentativas = 0;
		while (true) {

			System.out.println("Digite seu login: ");
			String tentativaLogin = leia.nextLine();

			System.out.println("Digite sua senha: ");
			String tentativaSenha = leia.nextLine();

			if (senha.equals(tentativaSenha) && login.equals(tentativaLogin)) {
				double saldo = 6500;
				while (true) {
					System.out.println("Bem vindo " + login);
					System.out.println("Digite 1 para ver saldo");
					System.out.println("Digite 2 para realizar um saque");
					System.out.println("Digite 3 para realizar um deposito");
					int opcao = leia.nextInt();	
					leia.nextLine();

					switch (opcao) {
					case 1:
						System.out.println("Seu saldo atual é: " + saldo);
						break;
					case 2:
						System.out.println("Digite o valor do saque: ");
						double saque = leia.nextDouble();
						leia.nextLine();

						if (saque <= saldo && saque > 0) {

							System.out.println("Digite a senha de 4 digitos");
							String senha4 = leia.nextLine();
							if (senha4.equals("1234")) {
								saldo = saldo - saque;
								System.out.println("Saque realizado com sucesso");
								System.out.println("Saldo atual: " + saldo);
							} else {
								System.out.println("Senha incorreta!");
							}

						}

						break;
					case 3:
						System.out.println("Digite o valor do deposito: ");
						double deposito = leia.nextDouble();
						leia.nextLine();
						if (deposito > 0) {
							saldo = saldo + deposito;
							System.out.println("Deposito realizado com sucesso");
							System.out.println("Saldo atual: " + saldo);
						} else {
							System.out.println("Valor inválido");
						}

						break;
					default:
						System.out.println("Opção inválida");
					}
					
					System.out.println("Você deseja "
						+ "fazer uma nova operação? [s/n]");
					char letra = leia.nextLine().charAt(0);
					if (letra == 'n') {
						System.out.println("Até logo");
						break;
					}
					
					
				}
			} else {
				System.out.println("Credenciais inválidas");
				tentativas++;

				if (tentativas == 3) {
					System.out.println("Uusuário bloqueado");
					break;
				}
			}
		}

	}

}
