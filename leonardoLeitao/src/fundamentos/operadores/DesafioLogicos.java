package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		System.out.println("Comprar tv de 50 polegada e toma sorvete\"?\" " + (trabalho1 && trabalho2));
		System.out.println("Comprar tv de 32polegada e toma sorvete: " + (trabalho1 ^ trabalho2));
		System.out.println("Vamos tomar sorvete: " + (trabalho1 || trabalho2));
		System.out.println("N�o vamos tomar sorvete, melhor para sa�de: " + ( !(trabalho1 && trabalho2)));
		System.out.println("N�o vamos comprar TV: " + ( !(trabalho1 && trabalho2)));
	}

}
