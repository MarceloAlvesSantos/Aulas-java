package oo.heranca;

// Monstro extends Jogador, Monstro est� erdando Tudo do Jogador
public class Monstro extends Jogador{
	public Monstro(){
		this(0, 0);
	}
	
	public Monstro(int x, int y){
		super(x, y);
	}
}
