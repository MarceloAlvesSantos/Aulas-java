package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Paula", 9.8);
		Aluno a4 = new Aluno("Karllem", 6.8);
		Aluno a5 = new Aluno("Pedro", 7.1);
		Aluno a6 = new Aluno("Caio", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a-> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "Parabéns " + a.nome + "! Você foi aprovada!"; 
		
		alunos.stream()
			//.filter(a -> a.nota >= 7) // Primeira forma
			.filter(aprovado) // Segunda forma utilizando o Predicate<Aluno>
			//.map(a -> "Parabéns " + a.nome + "! Você foi aprovada!") primaira forma
			.map(saudacaoAprovado)// Usando Function<Aluno, String>
			.forEach(System.out::println);
		
	}

}
