package classe;

public class AreaCirc {
	
	double raio;
	// Agora o valor de pi está associado a classe e não a instância
	// static final ou final static, a ordem não importa
	static final double PI = 3.14;  // Todos os modificadores vem antes do tipo
	// PI sendo uma constante, não poderar mudar o valor
	
	AreaCirc(double raioInicial) { //construtor
		raio = raioInicial;
	}
	
	double area() {  //Método
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) { //Método
		return PI * Math.pow(raio, 2);
	}
}
