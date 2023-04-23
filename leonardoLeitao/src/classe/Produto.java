package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	Produto(){  // De forma explicita o construtor padrão
		        // Passando nenhum parametro
	}
	
	
	Produto(String nomeInicial, double precoInicial){          // De forma explicita
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double calculo() {
		double resultado = preco * (1 - desconto);
		
		return resultado;
	}

}
