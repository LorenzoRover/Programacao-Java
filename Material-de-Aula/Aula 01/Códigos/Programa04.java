package exemplos;

// Operadores aritméticos
public class Programa04 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		// Soma
		int soma = num1 + num2;
		System.out.println("A soma de " + num1 + " com " + num2 + " é: " + soma);

		// subtração
		int diminuir = num1 - num2;
		System.out.println("A diferença de " + num1 + " com " + num2 + " é: " + diminuir);

		// multiplicação
		int produto = num1 * num2;
		System.out.println("O produto de " + num1 + " com " + num2 + " é: " + produto);

		// divisao
		int dividir = num1/num2;
		System.out.println("A divisao de " + num1 + " com " + num2 + " é: " + dividir);
		
		// Resto da divisao
		int resto = num1 % num2;
		System.out.println("O resto da divisao de " + num1 + " com " + num2 + " é: " + resto);

		
		// PROBLEMA (DOWNCASTING)
		num2 = 4;
		double dividir2 = (double) num1/num2;
		System.out.println("A divisao de " + num1 + " com " + num2 + " é: " + dividir2);

		// Incremento
		System.out.println(num1);
//		num1++;
		num1 = num1 +1;		
		System.out.println(num1);
		
		// Decremento
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		
		
		
		
		
		
		
		
		
	}

}
