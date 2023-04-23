package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o antepun�ltimo sal�rio: ");
		String antepe = entrada.nextLine().replace("," , ".");
		
		System.out.print("Digite o pun�ltimo sal�rio: ");
		String penul = entrada.nextLine().replace("," , ".");
		
		System.out.print("Digite o �ltimo sal�rio: ");
		String ultimo = entrada.nextLine().replace("," , ".");
		
	
		double salario1 = Double.parseDouble(antepe); // usando .replace para converte ',' em '.'
		double salario2 = Double.parseDouble(penul);
		double salario3 = Double.parseDouble(ultimo);

		double media = (salario1 + salario2 + salario3)/3;

		System.out.println("A m�dia dos tr�s sal�rios foi: " + media);

		entrada.close();
		
	}

}
