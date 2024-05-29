package aplicacao;

public class Teste {

	public static void main(String[] args) {
		double salario = 1500.512;

		String salarioo = String.valueOf(salario);

		for (int i = 0; i < salarioo.length(); i++) {

			char caracter = salarioo.charAt(i);

			if (caracter == '.') {

				if (salarioo.length() - 1 - i > 2) {
					System.out.println("Valor invalido");
				}

			}

		}

	}

}
