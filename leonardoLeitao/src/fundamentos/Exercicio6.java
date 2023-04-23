package fundamentos;



public class Exercicio6 {
	// 6. Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
	// Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
	public static void main(String[] args) {

		double a = 1;
		double b = 12;
		double c = -13;
		
		double d = (b * b) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(d)) / (2 * a);
		double x2 = (-b - Math.sqrt(d)) / (2 * a);
		
		System.out.println(" Raiz 1: " + x1 + " e Raiz 2: " + x2);
		// não coloquei a condição  da raiz para delta igual a 0 e menor que 0
		
		
	}
	
	
}
