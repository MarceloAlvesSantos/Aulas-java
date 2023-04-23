package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Digite o seu peso: ");
		double p = entrada.nextDouble();
		
		System.out.print(" Digite a sua altura: ");
		double h = entrada.nextDouble();
		
		double imc = p / (h*h);
		
		System.out.println(" O seu IMC é de " + imc);
		
		
		
		entrada.close();
	}

}
