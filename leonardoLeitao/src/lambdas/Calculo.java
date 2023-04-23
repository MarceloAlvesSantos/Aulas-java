package lambdas;
// Interface funcional só pode ter um único método
// Apartir da Interface funcional que poderemos criar as funções Lambdas
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
