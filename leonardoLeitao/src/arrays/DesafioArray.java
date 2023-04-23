package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Digite a quantidade de notas: ");
		int n = entrada.nextInt();
		
		System.out.println();
		double notas[] = new double[n];
		for( int i=0; i < n; i++ ) {
			System.out.printf(" Digite a %dª nota: ", (i+1));
			notas[i] = entrada.nextDouble();
		}
		double soma=0;
		for( double nota: notas) {
			soma += nota;
		}
		
		System.out.println("\n A média das notas: " + (soma/n));
	
		entrada.close();
	}

}
