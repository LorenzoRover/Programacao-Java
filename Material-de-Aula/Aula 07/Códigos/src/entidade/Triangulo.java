package entidade;

public class Triangulo {
	
	// Caracteristicas
	public double a;
	public double b;
	public double c;
	
	
	// Comportamento
	public double calcularArea() {
		double P = (a+ b + c)/2;
		double area = Math.sqrt( P * (P - a) * (P - b) * (P - c));
		return area;
	}

}
