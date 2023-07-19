package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioFilter {
	public static void main(String[] args) {
		Produto p1 = new Produto("Calculadora", 29.5, 0.3, 5.0);
		Produto p2 = new Produto("Telefone", 800.75, 0.25, 20.0);
		Produto p3 = new Produto("TV", 2100.0, 0.27, 0.0);
		Produto p4 = new Produto("PC", 5000.47, 0.3, 0.0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Function<Produto, String> chamadaPromocional = 
				p -> "Aproveite! " + p.nome + " por " + p.preco;
		
		produtos.stream()
			.filter(p -> p.desconto > 0.25)
			.filter(p -> p.frete == 0.0)
			.filter(p -> p.preco > 1000.0)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}

}


