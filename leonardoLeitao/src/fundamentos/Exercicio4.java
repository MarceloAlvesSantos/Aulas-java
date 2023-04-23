package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Digite um número: ");
		double n = entrada.nextDouble();
		
		System.out.println(" O quadrado será: " + n * n);
		System.out.println(" O cubo será: " + n * n * n);
		
		entrada.close();
	}

}
