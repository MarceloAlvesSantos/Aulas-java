package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Karllem", 65.00);
		
		Comida c1 = new Comida("Arroz", 0.100);
		Comida c2 = new Comida("Feijão", 0.150);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
		
	}

}
