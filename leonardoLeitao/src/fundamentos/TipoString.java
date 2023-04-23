package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		s="Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("Boa")); // startsWith -> se inicia com as primeiras letras ou palavras 
		System.out.println(s.toLowerCase().startsWith("boa")); // s.toLowerCase() -> não considerar letras maiúsculas e minúsculas
		System.out.println(s.toUpperCase().endsWith("TARDE"));  // ternmina com a palavra?
		System.out.println(s.length()); // quantos caracteres tem uma string
		System.out.println(s.equals("boa tarde")); // se é igual
		System.out.println(s.equalsIgnoreCase("boa tarde")); // não olha se é maiúsculo ou minúsculo
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1254.125;
		
		System.out.println("Nome:" + nome + "\nSobrenome: " + sobrenome 
				+ "\nIdade:" + idade 
				+ "\nSalario: " + salario + "\n\n");
		
		System.out.printf(" O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		String frase = String.format("\n O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
				
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
	}

}
