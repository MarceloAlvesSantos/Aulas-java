package classe;

//import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2); // False, pois s�o dois objetos distinto na mem�ria, est� comparando
									 //endere�o de mem�ria.
		System.out.println(u1.equals(u2)); // False, pois n�s n�o mechemos no Equals, ent�o ele faz igual ao ==
		
		//System.out.println(u2.equals(new Date()));
		
	}

}
