package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		// como está no mesmo pacote, não precisa importar 
		Produto p1 = new Produto("Notbook", 4356.89);
		
		
		var p2 = new Produto(); // Usou var, mas o Java reconhecer como Produto
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double resultado;
		resultado = p1.calculo();

		System.out.printf("Novo valor com desconto do %s: R$%.2f", p1.nome, resultado);
		
		double resultado2;
		resultado2 = p2.calculo();
		
		System.out.printf("\nNovo valor com desconto da %s: R$%.2f", p2.nome, resultado2);
		
		double mediaCarrinho =  (resultado + resultado2) / 2;
		System.out.printf("\nMédia do carrinho = R$%.2f", mediaCarrinho);
	}

}
