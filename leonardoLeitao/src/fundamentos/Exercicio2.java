package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// 2. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Digite a temperatura em celsius: ");
		double c = entrada.nextDouble();
		
		double f = (1.8 * c) + 32;
		
		System.out.println(" A temperatura em fahrenheit será " + f + "°F");
		
		
		entrada.close();
	}

}
