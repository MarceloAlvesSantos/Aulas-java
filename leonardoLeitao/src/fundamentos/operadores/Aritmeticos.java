package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		//var x = 34.56; // O java reconhecer que é double
		// Ou usar o próprio double
		//double y = 2.2;
		
		int a = 8;
		int b = 3;
		
		System.out.println(a / (double) b); // Usando CAST para trânsformar int em double
		
		System.out.println(8 % 3); //Para achar o resto da divisão, igual Linguagem C
		
	}

}
