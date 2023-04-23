package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // acessar pelo indice
		// Lista dar para acessar pelo indice, agora o Set não tem como
		
		System.out.println("Removido: " + lista.remove(1)); // removendo pelo indice, e retorna o nome removido
		System.out.println(lista.remove(new Usuario("Manu")));// retorna false or true
		
		System.out.println("Tem? " +  lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}

}
