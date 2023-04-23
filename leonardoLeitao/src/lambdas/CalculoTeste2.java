package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { // Fun��o Lambda
			return x + y;
		};
		System.out.println(calc.executar(2, 3));
		calc = (x, y) -> x * y; // quando n�o coloca chaves, o retorno ja � automatico.
		// Mas nessa condi��o s� aceita uma senten�a de c�digo
		System.out.println(calc.executar(2, 3));
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
