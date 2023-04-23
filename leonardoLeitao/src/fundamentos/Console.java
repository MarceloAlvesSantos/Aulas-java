package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// As tr�s principais formas de jogar dados no console
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nS�lario: %.1f", 1234.5678);
		// out -> saida por tela
		System.out.printf("\nNome: %s ", "Jo�o");
		// in -> entrada por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("\nDigite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);  //Usando printf, se for println usar +, concatena��o.
		
		entrada.close();  // OBS: O Scanner tem que ser fechado no final, fica usando recurso da m�quina ou mem�ria
		
		/* OBS: o m�todo nextLine() vai ler tudo que estiver no buffer de entrada at� encontrar um "\n". Como o nextInt() 
		 * deixou um "\n" para tr�s, � esse o valor que o nextLine() l�. Isso conclui a leitura e a pr�xima linha de 
		 * c�digo, que � "Qual o seu sobrenome?", � impressa. Para resolver esse problema, precisamos "pegar" o "\n" que 
		 * o nextInt() n�o l�. Isso pode ser feito colocando um comando nextLine() depois do nextInt(), de modo que o 
		 * c�digo abaixo vai funcionar da maneira como quer�amos. 
		 */
		/*Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		 
		teclado.close();*/
		
	}

}
