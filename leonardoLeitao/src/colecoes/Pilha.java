package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
// Pilha -> o �ltimo a entrar � o primeiro a sair
public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add(" O Pequeno Pr�ncipe");
		livros.push(" Don Quixote");
		livros.push(" O Hobbit");
		System.out.println(livros.peek());
		System.out.println(livros.element()); 
		// Tamb�m pode usar o Foreach
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());  // pop -> tamb�m mostra o nome e depois remove
		System.out.println(livros.poll()); 
		System.out.println(livros.poll()); 
		System.out.println(livros.poll()); 
		System.out.println(livros.poll());
		System.out.println(livros.pop()); // se n�o tiver, vai jogar uma exe��o
		//System.out.println(livros.remove()); 
		
		// estruturas de dados classicas Pilha e Fila
		
		
		
	}

}
