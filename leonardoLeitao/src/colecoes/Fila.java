package colecoes;

import java.util.LinkedList;
import java.util.Queue;
// fila -> o primeiro a entrar é o primeiro a sair
public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e Add -> adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); // se não conseguir adicionar, vai dar erro/ lança uma exceção 
		// .offer, outro método reponsável por adicionar
		// diferença dele pera o método add é que, quando vc tem filas com restrições de tamanho, é possivel que vc defina um
		//tamanho, e apartir desse limite ele não vai permitir nenhum outro elemento ser adicionado enquanto não 
		//for retirado da fila.
		fila.offer("Bia"); // se não conseguir adicionar, retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek()); // sempre retorna o mesmo elemento, pois ele ler e não remove
		System.out.println(fila.element());
		System.out.println(fila.element());
		// Diferençã entre peek  e element é quando a fila está vazia
		// peek retorna null
		// element lança uma exceção
	
		
		System.out.println(fila.poll()); // o poll mostra o nome e depois remove
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());  // se estiver vazio, return null
		System.out.println(fila.remove()); // se estiver vazio, lança uma exeção
		
		// poll e romove -> obter o próximo elemento da fila e remove
		
		
		// fila.size()
		// fila.clear(); vai limpa a fila
		// fila.isEmpty(); para saber se a fila está or não vazia
		// fila.contains(..) para saber se tem o elemento
		
	}

}
