package aula_junit.parte02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aula_junit.parte01.Desempenho;
import aula_junit.parte01.ValorInvalidoException;

public class TesteContagemMoedas {

	@Test
	public void testContagemMoedas1() throws Exception {
		// Dados de entrada e saida - do caso de teste CT01 - Quant. de 150 moedas do tipo 0.05
		//public static double[] MOEDAS = { 0.01, 0.05, 0.10, 0.25, 0.50, 1 };

		int[] qtdMoedas = {0, 150, 0, 0, 0, 0};
	//	double valor = 0.05;
		int qtdTotalMoedas = 0;

		boolean esperado = true;
		
		// Execucao do metodo
		ContagemMoedas contagemMoedas = new ContagemMoedas();
		int[] valorEsperado = contagemMoedas.calcularValorMoedas(qtdMoedas);
		int[] valorObtido = {7, 50};


		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido);
		// assertEquals("CT01", esperado, obtido);
		
	}

	@Test
	public void testContagemMoedas2() throws Exception {
		// Dados de entrada e saida - do caso de teste CT01 - Quant. de 150 moedas do tipo 0.05
		//public static double[] MOEDAS = { 0.01, 0.05, 0.10, 0.25, 0.50, 1 };

		int[] qtdMoedas = {150, 150, 250, 150, 150, 150};
	//	double valor = 0.05;
		int qtdTotalMoedas = 0;

		boolean esperado = true;
		
		// Execucao do metodo
		ContagemMoedas contagemMoedas = new ContagemMoedas();
		int[] valorEsperado = contagemMoedas.calcularValorMoedas(qtdMoedas);
		int[] valorObtido = {7, 50};


		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido);
		// assertEquals("CT01", esperado, obtido);
		
	}

}
