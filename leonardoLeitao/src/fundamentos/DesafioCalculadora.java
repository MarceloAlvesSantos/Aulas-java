package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		double n2 = entrada.nextDouble();
		
		System.out.print("Digite o simbolo da opera��o que deseja ( + , - , * ou / )?: ");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao)?  n1 + n2: 0;
		resultado = "/".equals(operacao)?  n1 / n2: resultado;
		resultado = "*".equals(operacao)?  n1 * n2: resultado;
		resultado = "-".equals(operacao)?  n1 - n2: resultado;
		resultado = "%".equals(operacao)?  n1 % n2: resultado;
		
		System.out.println(n1+" " + operacao+ " "  + n2 + " = " + resultado );
		
		entrada.close();
	}

}
