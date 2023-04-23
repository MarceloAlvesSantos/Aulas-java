package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(12, 9, 1992);
		
		Data d2 = new Data();
			
		String karllem;
		karllem = d2.obterDataFormatada();
		System.out.println(" &&&&& Data de aniversário  &&&&&");
		System.out.printf(" Marcelo nasceu em: %s", d1.obterDataFormatada());
		System.out.printf("\n Marco Zero: %s", karllem);
		
	}

}
