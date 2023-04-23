package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// " <String> " define o tipo, significa generiques
		//Set<String> listaAprovados = new HashSet<>(); // <>, n�o precisar repetir, mas tem que colocar isso, <>
		SortedSet<String> listaAprovados = new TreeSet<>(); // TreeSet, garante o ordenamento, do menor para o maior 
		// SortedSet, vc pode definir qual ordem seguir
		listaAprovados.add("Anna");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		// O Set n�o respeita a orde de inse��o, n�o tem ordena��o
		// o Set n�o repete 
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>(); 
		
		nums.add(5);
		nums.add(2);
		nums.add(7);
		nums.add(3);
		
		for( int n: nums) {
			System.out.println(n);
		}
		
		// o que garante a ordem de inser��o o LinkedHashSet
		
		
	}

}
