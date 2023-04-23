package oo.encapsulamento;

public class Pessoateste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", -30);
		p1.setIdade(-50); // alterar o valor
		
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1);// toString
	}

}
