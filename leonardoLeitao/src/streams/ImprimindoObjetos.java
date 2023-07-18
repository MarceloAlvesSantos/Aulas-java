package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	// Usando List/Iterator/Stream
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Ana", "Gui", "Luca");
		//Forma 01
		System.out.println("Usando o for...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		//Forma 02
		System.out.println("\nUsando o foreach...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		//Forma 03
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Forma 04
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //Laço interno!!!
		
	}

}
