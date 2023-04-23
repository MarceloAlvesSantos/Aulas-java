package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		b = 4; // De decimal para inteiro pode, o inverso já não pode.
		System.out.println(b);
		
		// Nessa linha vai dar problema, pois estarei misturando double com string.
		// b = "texto"; 
		
		var c = "Texto";
		System.out.println(c);

		c = "Outro texto";
		System.out.println("\n"+ c);
	}

}
