package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String("texto"); // ou "texto";
		s.toUpperCase();
		// OBS: Tudo em java é objeto, menos os oitos tipos primitivos
		//Wrappers -> São a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}

}
