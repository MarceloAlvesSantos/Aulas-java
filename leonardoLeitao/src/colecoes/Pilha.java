package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
// Pilha -> o último a entrar é o primeiro a sair
public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add(" O Pequeno Príncipe");
		livros.push(" Don Quixote");
		livros.push(" O Hobbit");
		System.out.println(livros.peek());
		System.out.println(livros.element()); 
		// Também pode usar o Foreach
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());  // pop -> também mostra o nome e depois remove
		System.out.println(livros.poll()); 
		System.out.println(livros.poll()); 
		System.out.println(livros.poll()); 
		System.out.println(livros.poll());
		System.out.println(livros.pop()); // se não tiver, vai jogar uma exeção
		//System.out.println(livros.remove()); 
		
		// estruturas de dados classicas Pilha e Fila
		
		
		
	}

}
