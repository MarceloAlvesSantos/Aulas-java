package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		
		System.out.println("\nlambda #01...");
		// Usando express�o Lambdas
		aprovados.forEach((nome) -> { System.out.println(nome + "!!!");});
		//Se tiver um �nico par�metro, n�o precisa ter os ()
		//aprovados.forEach(nome -> { System.out.println(nome + "!!!");});
		//Se tiver uma �nica senten�a de c�digo, voc� pode tirar o par de {}
		//aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod reference #1...");
		aprovados.forEach(System.out::println); // � menos flex�vel, n�o daria para colocar os "!!!"
	    
		System.out.println("\nlambda #02...");
		aprovados.forEach(nome ->  meuImprimir(nome)); // meuImprimir(nome); Uma express�o Lambda passada como par�metro
		
		
		System.out.println("\nMethod reference #2...");
		aprovados.forEach(Foreach :: meuImprimir);  // Passando uma refer�ncia para a fun��o que a pessoa criou
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome � " + nome);
	}

}
