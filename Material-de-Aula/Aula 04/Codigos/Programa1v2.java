package exemplos;

public class Programa1v2 {

	public static void main(String[] args) {
		
		int[] idades = {20,15,60,55,30};
		int campeao = idades[0];
		
		for (int i = 0; i < idades.length; i++) {			
			if (campeao > idades[i]) {
				campeao = idades[i];
			}
		}		
		
		System.out.println(campeao);
		
		
		
		
		
		

	}

}
