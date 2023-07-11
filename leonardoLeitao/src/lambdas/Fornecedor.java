package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		// nUsar o (), pois não recebeu nenhum parâmetro de entrada
		Supplier<List<String>> umLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
		System.out.println(umLista.get());
		
	}

}
 