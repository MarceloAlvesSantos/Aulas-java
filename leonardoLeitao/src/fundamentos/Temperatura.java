package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final int AJUSTE = 32;
		final double FATOR = 5/9.0; 
		double f, c;
		f = 86;
		c = (f - AJUSTE) * FATOR;
		System.out.println(" A temperatura em Celsius � " + c + " �C.");
		f = 0;
		c = (f - AJUSTE) * FATOR;
		System.out.format("\n A temperatura em Celsius � %.2f �C.", c);
	}

}
