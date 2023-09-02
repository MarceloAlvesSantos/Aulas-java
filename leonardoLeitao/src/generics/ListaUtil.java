package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);// pegando o último elemento da lista
	}
	
	public static <T> T getUltimo2(List<T> lista) { // Usando generics
		return lista.get(lista.size() - 1);// pegando o último elemento da lista
	}

}
