package exemplos;

// Operadores relacionais
public class Programa05 {

	public static void main(String[] args) {
		
		
		int num1 = 5;
		int num2 = 5;
		
		boolean resultado = (   num1 == num2    );
		System.out.println(resultado);
		
		resultado = (num1 != num2);
		System.out.println(resultado);
		
		resultado = (num1 >  num2);
		System.out.println(resultado);
		
		resultado = (num1 >=  num2);
		System.out.println(resultado);
		
		String senha = "aloooooooooooooo";
		resultado =    senha.length() >= 8;
		System.out.println("A senha é valida?? " + resultado);
		
		
		
		senha = "admin";
		String tentativa = "adminn";
		
		String login = "admin";
		String tentativaLogin = "admin";
		
		boolean acesso = (login.equals(tentativaLogin)  && senha.equals(tentativa) );
		System.out.println(acesso);
		
		
		
		
		
		

	}

}
