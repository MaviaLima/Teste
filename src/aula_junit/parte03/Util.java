package aula_junit.parte03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Util {
	
	/**
	 * Arredondar um valor do tipo double para n casas decimais
	 * @param v Valor
	 * @param numCasas Numero de casas decimais
	 * @return novo valor
	 */
	public static double arredondarValor(double v, int numCasas){
		BigDecimal bd = new BigDecimal(v);
		return bd.setScale(numCasas, RoundingMode.HALF_UP).doubleValue();
	}
	
}
