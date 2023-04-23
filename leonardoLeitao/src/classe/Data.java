package classe;

public class Data {
	
	int dia; // isso seria o atributo, o método seria já colocar uns valores
	int mes;
	int ano;
	//construtor
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); // Usando this como método, de um construtor para outro
	}
	//construtor
	Data (int dia, int mes, int ano){ // ser algum parametro for uma constante, pode usar 'final', antes do tipo
		//this(); Isso já não poderia, pois na linha 13 já tem um, e iria entrar em um loop infinito.
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		//this: nesse caso foi para para evitar conflito de nomes
	}
	
	//Eu fiz assim!!
	/*String obterDataFormatada() {
		///*Integer dia1 = dia;
		Integer mes1 = mes; // Não precisaria disso!
		Integer ano1 = ano;
		String resultado = dia +"/"+ mes+"/"+ano;  
		return resultado;
	}*/
	//Professor fez assim!
	String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano); // O this é opcional aqui
		//Com isso, vc já manda um texto, e não precisa converte de número para string.
	}

}
