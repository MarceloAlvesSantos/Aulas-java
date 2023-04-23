package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	// 1. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Digite a temperatura em Fahrenheit: ");
		double f = entrada.nextDouble();
		
		double c = ( f - 32 ) / 1.8;
		
		System.out.println(" A temperatura em Celsius será: " + c + "°C");
		
		entrada.close();
	}

}
