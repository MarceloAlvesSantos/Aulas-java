package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// As três principais formas de jogar dados no console
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSálario: %.1f", 1234.5678);
		// out -> saida por tela
		System.out.printf("\nNome: %s ", "João");
		// in -> entrada por teclado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("\nDigite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);  //Usando printf, se for println usar +, concatenação.
		
		entrada.close();  // OBS: O Scanner tem que ser fechado no final, fica usando recurso da máquina ou memória
		
		/* OBS: o método nextLine() vai ler tudo que estiver no buffer de entrada até encontrar um "\n". Como o nextInt() 
		 * deixou um "\n" para trás, é esse o valor que o nextLine() lê. Isso conclui a leitura e a próxima linha de 
		 * código, que é "Qual o seu sobrenome?", é impressa. Para resolver esse problema, precisamos "pegar" o "\n" que 
		 * o nextInt() não lê. Isso pode ser feito colocando um comando nextLine() depois do nextInt(), de modo que o 
		 * código abaixo vai funcionar da maneira como queríamos. 
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
