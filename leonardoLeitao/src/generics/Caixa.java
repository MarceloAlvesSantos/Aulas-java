package generics;

public class Caixa<T> { // Na prática usa apenas uma letra.
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}

}
