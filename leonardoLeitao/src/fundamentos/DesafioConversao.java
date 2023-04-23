package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o antepunúltimo salário: ");
		String antepe = entrada.nextLine().replace("," , ".");
		
		System.out.print("Digite o punúltimo salário: ");
		String penul = entrada.nextLine().replace("," , ".");
		
		System.out.print("Digite o último salário: ");
		String ultimo = entrada.nextLine().replace("," , ".");
		
	
		double salario1 = Double.parseDouble(antepe); // usando .replace para converte ',' em '.'
		double salario2 = Double.parseDouble(penul);
		double salario3 = Double.parseDouble(ultimo);

		double media = (salario1 + salario2 + salario3)/3;

		System.out.println("A média dos três salários foi: " + media);

		entrada.close();
		
	}

}
