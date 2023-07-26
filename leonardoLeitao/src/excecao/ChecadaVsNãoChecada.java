package excecao;

public class ChecadaVsNãoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Não chacada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
		
	}
	
	// Excecão NÂO checada ou NÂO verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02");
		
	}

}
