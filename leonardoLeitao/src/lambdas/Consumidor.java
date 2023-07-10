package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.74, 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 1252.74, 0.19);
		Produto p3 = new Produto("Caderno", 8.74, 0.4);
		Produto p4 = new Produto("Borracha", 25.74, 0.15);
		Produto p5 = new Produto("Lapis", 7.74, 0.8);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
