package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.123612358888; //explícita (CAST)
		System.out.println(b);
		
		int c = 256;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
