package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F° - 32) x 5/9 = C°
		double f = 0; 
		final double PARTE1 = 32;
		final double PARTE2 =  5/9.0;
		double formula = (f - PARTE1) * PARTE2;
		
		System.out.println(formula);
	}
}
