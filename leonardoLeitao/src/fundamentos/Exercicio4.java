package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Digite um n�mero: ");
		double n = entrada.nextDouble();
		
		System.out.println(" O quadrado ser�: " + n * n);
		System.out.println(" O cubo ser�: " + n * n * n);
		
		entrada.close();
	}

}
