package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { // Função Lambda
			return x + y;
		};
		System.out.println(calc.executar(2, 3));
		calc = (x, y) -> x * y; // quando não coloca chaves, o retorno ja é automatico.
		// Mas nessa condição só aceita uma sentença de código
		System.out.println(calc.executar(2, 3));
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
