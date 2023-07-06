package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo; // come�a com valor falso
	private boolean ligarAr; // come�a com valor falso
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidademaxima){
		super(velocidademaxima);
		setDelta(15);
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}
	
	//@Override
	/*public void acelerar() {
		velocidadeAtual += 15;
	}*/
}