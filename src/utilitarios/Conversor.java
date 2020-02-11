package utilitarios;

public class Conversor {
	
	public static final double IOF = 0.06;
	
	public static double Conversao(double cot, double dol ) {
		return cot * (dol + (dol*0.06));
	}

}
