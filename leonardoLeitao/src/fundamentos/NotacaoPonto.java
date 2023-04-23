package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		int tamanho;
		//  função ponto
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		tamanho = s.length();
		System.out.println("Tamanho da frase acima: " + tamanho);
		
		System.out.println("Leo".toUpperCase());
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
	}

}
