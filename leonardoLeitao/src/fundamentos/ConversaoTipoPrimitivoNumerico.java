package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // impl�cita
		System.out.println(a);
		
		float b = (float) 1.123612358888; //expl�cita (CAST)
		System.out.println(b);
		
		int c = 256;
		byte d = (byte) c; //expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
