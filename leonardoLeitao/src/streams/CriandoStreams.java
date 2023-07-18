package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		// interface funcional que recebe um parametro e não retorna nada "Consumer"
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;

		
		Stream<String> langs = Stream.of("java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);// Vai até o (N - 1)
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); // Valores executados de maneira diferentes "parallelStream()"
		
		//Stream.generate(() -> "a").forEach(print); // Stream infinito
		Stream.iterate(0, n -> n + 1).forEach(println); // Stream infinito
		
		
	}
	
}
