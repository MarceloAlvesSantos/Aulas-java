package lambdas;
// Interface funcional s� pode ter um �nico m�todo
// Apartir da Interface funcional que poderemos criar as fun��es Lambdas
@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b);
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}
