package colecoes;

import java.util.LinkedList;
import java.util.Queue;
// fila -> o primeiro a entrar � o primeiro a sair
public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e Add -> adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana"); // se n�o conseguir adicionar, vai dar erro/ lan�a uma exce��o 
		// .offer, outro m�todo repons�vel por adicionar
		// diferen�a dele pera o m�todo add � que, quando vc tem filas com restri��es de tamanho, � possivel que vc defina um
		//tamanho, e apartir desse limite ele n�o vai permitir nenhum outro elemento ser adicionado enquanto n�o 
		//for retirado da fila.
		fila.offer("Bia"); // se n�o conseguir adicionar, retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek()); // sempre retorna o mesmo elemento, pois ele ler e n�o remove
		System.out.println(fila.element());
		System.out.println(fila.element());
		// Diferen�� entre peek  e element � quando a fila est� vazia
		// peek retorna null
		// element lan�a uma exce��o
	
		
		System.out.println(fila.poll()); // o poll mostra o nome e depois remove
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());  // se estiver vazio, return null
		System.out.println(fila.remove()); // se estiver vazio, lan�a uma exe��o
		
		// poll e romove -> obter o pr�ximo elemento da fila e remove
		
		
		// fila.size()
		// fila.clear(); vai limpa a fila
		// fila.isEmpty(); para saber se a fila est� or n�o vazia
		// fila.contains(..) para saber se tem o elemento
		
	}

}
