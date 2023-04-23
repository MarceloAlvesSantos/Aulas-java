package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double , converte double primitivo, para Double classe
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1);  // int -> Integer
		conjunto.add("x");  // char -> Caractere
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("Teste"); // String
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("x"));

		System.out.println("Tamanho � " + conjunto.size());
		// contains(), serve para saber se um elemento est� ou n�o contido dentro do conjunto.
		System.out.println(conjunto.contains("x"));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		// Set desse lado � permetido, mas n�o faz nenhuma diferen�a
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// n�o mantem a ordem, pode at� conicidir.
		//conjunto.addAll(nums);  // Uni�o entre dois conjuntos,
		//System.out.println(conjunto); 
		
		conjunto.retainAll(nums);  // Interce��o entre dois conjuntos,
		System.out.println(conjunto); 
		
		conjunto.clear();  // Para limpar
		System.out.println(conjunto);
	}

}
