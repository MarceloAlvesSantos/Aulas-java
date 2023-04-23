package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// OBS: O modo posfixado tem menos presedencia que o prefixado
		a++; // a = a + 1  // incrementa Forma Posfixada
		a--; // a = a - 1  // decrementa Forma Posfixada
		
		// Maior precedência
		++b; // b = b + 1  // Prefixada
		--b; // b = b + 1  // Prefixada
		System.out.println(a);
		System.out.println(b);
		
	}

}
