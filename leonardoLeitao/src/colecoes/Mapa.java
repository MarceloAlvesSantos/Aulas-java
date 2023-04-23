package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		// Quando for passar valor, tem que passar os dois.
		// Put, adiciona e se já tiver substitui
		usuarios.put(1,  "Roberta");
		// O Map não tem o .add "adicionar"
		usuarios.put(20, "Ricardo");
		usuarios.put(2, "Karllem");
		usuarios.put(4, "Marcelo");  
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // pega o conjunto da chave, e não mantem ordenado, o que vier mantem 
		System.out.println(usuarios.values());// pega só os valores
		System.out.println(usuarios.entrySet()); // Pega chave e valor ao mesmo tempo
		System.out.println("");
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Marcelo"));
		System.out.println(usuarios.containsKey(4));
		
		System.out.println(usuarios.get(20)); // pegando apartir(ou pela chave) das chaves
		System.out.println("");
		System.out.println(usuarios.remove(1)); // Removendo pela chave
		System.out.println(usuarios.remove(20, "Ricardo")); // remover a partir da chave e valor
		
		// formas de percorre os elementos de um Map
		// 3 formas: só as chaves, só os valores e os 2 ao mesmo tempo
		System.out.println("");
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println("");
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println("");
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());			
		}
		
	}

}
