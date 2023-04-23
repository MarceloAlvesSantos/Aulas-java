package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double n = 0;
		double soma = 0;
		int cont = 0;
		System.out.println("####### CALCULAR A MÉDIA DAS NOTAS #######");
		while(n!=-1) {
			System.out.print("Digite a nota: ");
			double nota = entrada.nextDouble();
			while(nota <0 || nota >10) {
				System.out.print("Nota invalida, digite outra nota:");
				nota = entrada.nextDouble();
			}
			soma += nota;
			cont ++;
			System.out.print("Digite -1 para sair ou digite qualquer número para continuar: ");
			n= entrada.nextDouble();
		}
		System.out.print(" A média das notas é: " + soma/cont);
		entrada.close();
	}

}
