package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		//a1.pi = 10;  // Pois � variavel de inst�ncia

		//AreaCirc a2 = new AreaCirc(5);
		// agora vai usar o m�todo, sem criar a inst�ncia
		//a2.raio = 100;
		//a2.pi = 5;  // Pois � variavel de inst�ncia
		
		// J� que pertence a classe, para acessar, tem que usar o nome da classe
		//AreaCirc.PI = 3.1415;
		
		// Como pi est� associado a classe, a ordem importa
		System.out.println(a1.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
		// Quando o valor est� associado a classe � como se fosse uma vari�vel global.
	}

}
