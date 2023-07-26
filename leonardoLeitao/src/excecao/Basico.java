package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
			System.out.println("Erro em imprimirNomeDoAluno");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
