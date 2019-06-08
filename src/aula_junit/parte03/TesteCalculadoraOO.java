package aula_junit.parte03;

public class TesteCalculadoraOO {

	public static void main(String[] args) {
		
		CalculadoraIPTUService calcService = new CalculadoraIPTUService();
		
		double valorIPTU = calcService.calcularIPTU(TipoImovel.RESIDENCIAL, 180000, 0.0);
		System.out.println(valorIPTU);
	//	System.out.println(calcService.toString());
	}
}
