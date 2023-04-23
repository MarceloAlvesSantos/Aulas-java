package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		// Parte 1
	    int a =  6 * ( 3 + 2 ) ;
		double b = (double) Math.pow ( a , 2);
		double c = b / ( 3 * 2 );
		
		// Parte 2
		double d = ((( 1 - 5 ) * ( 2 - 7 ))/ 2);
		double e = Math.pow(d, 2);
		
		// Subtração
		double f = ( c - e );
		
		// Superior, potencia de 3
		double g = Math.pow( f, 3);
		
		// Inferior, potencia de 3
		double h = Math.pow(10, 3);
		
		// Divisão final
		double i = (g / h);
		
		// Imprimindo
		System.out.println("Resultado: " + i);
		
		
	}  

}
