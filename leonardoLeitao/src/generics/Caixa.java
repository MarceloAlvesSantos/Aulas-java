package generics;

public class Caixa<T> { // Na pr�tica usa apenas uma letra.
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}

}
