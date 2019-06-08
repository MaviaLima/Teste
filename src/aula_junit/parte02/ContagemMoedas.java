package aula_junit.parte02;

public class ContagemMoedas {

	public static double[] MOEDAS = { 0.01, 0.05, 0.10, 0.25, 0.50, 1 };

	/**
	 * Método para calcular o valor em real de um total de moedas
	 * @param qtdMoedas - ordem: 1, 5, 10, 25, 50 centavos, 1 real
	 * @return { reais , centavos }
	 * @throws Exception
	 */
	public int[] calcularValorMoedas(int[] qtdMoedas) throws Exception {
		double valor = 0;
		int qtdTotalMoedas = 0;

		for (int i = 0; i < MOEDAS.length; i++) {
			if (qtdMoedas[i] > 250) {
				throw new Exception("Quantidade de moedas de " + MOEDAS[i] + " excedeu o limite.");
			}
			qtdTotalMoedas += qtdMoedas[i];
			if (qtdTotalMoedas > 1000) {
				throw new Exception("Quantidade total de moedas excedeu o limite.");
			}
			valor += qtdMoedas[i] * MOEDAS[i];
		}

		int numReais = 0;
		int numCentavos = 0;
		while (valor > 1) {
			numReais++;
			valor--;
		}
		numCentavos = (int) (valor * 100);
		int[] retorno = { numReais, numCentavos };
		return retorno;
	}

}
