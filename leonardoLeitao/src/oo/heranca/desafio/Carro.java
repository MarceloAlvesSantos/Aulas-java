package oo.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 15;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {	
			velocidadeAtual += getDelta() ;
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString(){
		return " Velocidade atual � " + velocidadeAtual + " Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
