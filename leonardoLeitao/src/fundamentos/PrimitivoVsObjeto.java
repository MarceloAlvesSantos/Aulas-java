package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String("texto"); // ou "texto";
		s.toUpperCase();
		// OBS: Tudo em java � objeto, menos os oitos tipos primitivos
		//Wrappers -> S�o a vers�o objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}

}
