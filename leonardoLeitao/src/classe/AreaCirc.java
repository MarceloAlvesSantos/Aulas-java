package classe;

public class AreaCirc {
	
	double raio;
	// Agora o valor de pi est� associado a classe e n�o a inst�ncia
	// static final ou final static, a ordem n�o importa
	static final double PI = 3.14;  // Todos os modificadores vem antes do tipo
	// PI sendo uma constante, n�o poderar mudar o valor
	
	AreaCirc(double raioInicial) { //construtor
		raio = raioInicial;
	}
	
	double area() {  //M�todo
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) { //M�todo
		return PI * Math.pow(raio, 2);
	}
}
