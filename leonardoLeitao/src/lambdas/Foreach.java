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
		// Usando expressão Lambdas
		aprovados.forEach((nome) -> { System.out.println(nome + "!!!");});
		//Se tiver um único parâmetro, não precisa ter os ()
		//aprovados.forEach(nome -> { System.out.println(nome + "!!!");});
		//Se tiver uma única sentença de código, você pode tirar o par de {}
		//aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod reference #1...");
		aprovados.forEach(System.out::println); // É menos flexível, não daria para colocar os "!!!"
	    
		System.out.println("\nlambda #02...");
		aprovados.forEach(nome ->  meuImprimir(nome)); // meuImprimir(nome); Uma expressão Lambda passada como parâmetro
		
		
		System.out.println("\nMethod reference #2...");
		aprovados.forEach(Foreach :: meuImprimir);  // Passando uma referência para a função que a pessoa criou
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}

}
