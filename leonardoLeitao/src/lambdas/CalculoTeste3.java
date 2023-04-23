package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		// N�o: int  -> Double
		// Double a = 1;  // n�o aceita, literal inteiro
		// Double b = 1.0; // primitivo para classe
		
		// double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> { // Fun��o Lambda
			return x + y;
		};
		System.out.println(calc.apply(2.0, 3.0));
		calc = (x, y) -> x * y; 
		
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> { // Fun��o Lambda
			return x + y;
		};
		System.out.println(calc2.apply(2, 3));
		calc = (x, y) -> x * y; 
		
		System.out.println(calc2.apply(2, 3));
	}
}
