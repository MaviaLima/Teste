package aula_junit.parte03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraIPTUServiceTest {

	/* Faixa 3
	 * Tipo de Imóvel	Não Residencial	←Preencha de acordo a ocupação	
	Base Cálculo	R$ 550.000,00	←Valor de Mercado do Imóvel	(faixa 3)
	Valor do Desconto	R$ 120,00	Até 30% do IPTU calculado	
	 */
	@Test
	public void TesteCalculoImovelNaoResidencialComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 550000;
		double valorDesconto = 120;
		double valorEsperado = 7424.89;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}
	
	@Test
	public void TesteCalculoImovelNaoResidencial () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 550000;
		double valorDesconto = 0;
		double valorEsperado = 7544.89;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}

	@Test
	public void TesteCalculoImovelResidencialComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 550000;
		double valorDesconto = 120;
		double valorEsperado = 3856.43; //3876.44;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}

	@Test
	public void TesteCalculoImovelResidencial () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 550000;
		double valorDesconto = 0;
		double valorEsperado = 3976.43; //3976.44; Problema de arredondamento
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}
	@Test
	public void TesteCalculoImovelTerritorial() {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 550000;
		double valorDesconto = 120;
		double valorEsperado = 9161.90;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}

	@Test
	public void TesteCalculoImovelTerritorialComDesconto() {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 550000;
		double valorDesconto = 0;
		double valorEsperado = 9281.90;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}

	/* Faixa 1 */
	@Test
	public void TesteCalculoImovelResidencialFaixaIsenta () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 47700.00;
		double valorDesconto = 0;
		//double valorEsperado = 0;
		double valorEsperado = 286.20; //Valor esperado 0 uma vez que e isento

		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	
	@Test
	public void TesteCalculoImovelResidencialFaixa1 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 47725.00;
		double valorDesconto = 0;
		double valorEsperado = 286.35; 
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
		
	}
	@Test
	public void TesteCalculoImovelResidencialFaixa1ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 47725.00;
		double valorDesconto = 50;
		double valorEsperado = 236.35; //Valor esperado 0 uma vez que e isento
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
		
	}

	@Test
	public void TesteCalculoImovelNaoResidencialFaixa1 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 47725;
		double valorDesconto = 0;
		double valorEsperado = 584.63;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	@Test
	public void TesteCalculoImovelNaoResidencialFaixa1ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 47725;
		double valorDesconto = 50;
		double valorEsperado = 534.63;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	@Test
	public void TesteCalculoImovelTerritorialFaixa1 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 47725;
		double valorDesconto = 20;
		double valorEsperado = 457.26;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	@Test
	public void TesteCalculoImovelTerritorialFaixa1SemDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 47725;
		double valorDesconto = 0;
		double valorEsperado = 477.26;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	@Test
	public void TesteCalculoImovelTerritorialFaixa1LimiteMax () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 95450;
		double valorDesconto = 0;
		double valorEsperado = 572.70;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	

	@Test
	public void TesteCalculoImovelResidencialSemDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 18000;
		double valorDesconto = 0;
		double valorEsperado = 108.00; //Valor esperado ZERO pois eh isento
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}

	//Base Cálculo	R$ 180.000,00	←Valor de Mercado do Imóvel	
	@Test
	public void TesteCalculoImovelNaoResidencialSemDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 18000;
		double valorDesconto = 0;
		double valorEsperado = 216.00;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}
	

	@Test
	public void TesteCalculoImovelNaoResidencialLimMax () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 35793;
		double valorDesconto = 0;
		double valorEsperado = 429.52;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);
	}

	//Base Cálculo	R$ 180.000,00	←Valor de Mercado do Imóvel	
		@Test
		public void TesteCalculoImovelTerritorialSemDesconto () {
			//Dados de entrada 
			TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
			double valorInicial = 18000;
			double valorDesconto = 0;
			double valorEsperado = 180.00;
			
			// Execucao do metodo
			CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
			double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
			
			// Verificacao do teste
			assertEquals(valorEsperado, valorObtido, 0.00);
		}

	
	/*Faixa 2*/
	@Test
	public void TesteCalculoImovelResidencialFaixa2 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 100000;
		double valorDesconto = 0;
		double valorEsperado = 604.54; //604.55 Valor Esperado
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	
	@Test
	public void TesteCalculoImovelResidencialFaixa2ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 100000;
		double valorDesconto = 50;
		double valorEsperado = 554.54; //554.55
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	
	/*Faixa 2*/
	@Test
	public void TesteCalculoImovelNaoResidencialFaixa2ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 100000;
		double valorDesconto = 50;
		double valorEsperado = 1214.21;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/*Faixa 2*/
	@Test
	public void TesteCalculoImovelNaoResidencialFaixa2 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 100000;
		double valorDesconto = 0;
		double valorEsperado = 1264.21;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	/*Faixa 2*/
	@Test
	public void TesteCalculoImovelTerritorialFaixa2ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 100000;
		double valorDesconto = 50;
		double valorEsperado = 1263.66;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	@Test
	public void TesteCalculoImovelTerritorialFaixa2 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 100000;
		double valorDesconto = 0;
		double valorEsperado = 1313.66;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/* Faixa 4*/
	@Test
	public void TesteCalculoImovelResidencialFaixa4 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 650000;
		double valorDesconto = 0;
		double valorEsperado = 4776.43; // 4776.44
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/* Faixa 4*/
	@Test
	public void TesteCalculoImovelResidencialFaixa4ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 650000;
		double valorDesconto = 200;
		double valorEsperado = 4576.43;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/* Faixa 4*/
	@Test
	public void TesteCalculoImovelNaoResidencialFaixa4 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 650000;
		double valorDesconto = 0;
		double valorEsperado = 8998.33;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	@Test
	public void TesteCalculoImovelNaoResidencialFaixa4ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 650000;
		double valorDesconto = 200;
		double valorEsperado = 8798.33;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/* Faixa 4*/
	@Test
	public void TesteCalculoImovelTerritorialFaixa4 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 650000;
		double valorDesconto = 0;
		double valorEsperado = 11281.9;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/* Faixa 4*/
	@Test
	public void TesteCalculoImovelTerritorialFaixa4_2 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 750000;
		double valorDesconto = 0;
		double valorEsperado = 13452.51;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	@Test
	public void TesteCalculoImovelTerritorialFaixa4_2comDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 750000;
		double valorDesconto = 200;
		double valorEsperado = 13252.51;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	/* Faixa 4*/
	@Test
	public void TesteCalculoImovelTerritorialFaixa4ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 650000;
		double valorDesconto = 200;
		double valorEsperado = 11081.9;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/*Faixa 5*/
	@Test
	public void TesteCalculoImovelResidencialFaixa5 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 2650000;
		double valorDesconto = 0;
		double valorEsperado = 24048.11;//24048.12
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	
	/*Faixa 5*/
	@Test
	public void TesteCalculoImovelResidencialFaixa5ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.RESIDENCIAL;
		double valorInicial = 2650000;
		double valorDesconto = 2000;
		double valorEsperado = 22048.11;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/*Faixa 5*/
	@Test
	public void TesteCalculoImovelNaoResidencialFaixa5 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 2650000;
		double valorDesconto = 0;
		double valorEsperado = 40455.2;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}

	/*Faixa 5*/
	@Test
	public void TesteCalculoImovelNaoResidencialFaixa5ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 2650000;
		double valorDesconto = 2000;
		double valorEsperado = 38455.2;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	/*Faixa 5*/
	@Test
	public void TesteCalculoImovelTerritorialFaixa5 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 2650000;
		double valorDesconto = 0;
		double valorEsperado = 68236.85;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}


		/*Faixa 5*/
	@Test
	public void TesteCalculoImovelTerritorialFaixa5ComDesconto () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.TERRITORIAL;
		double valorInicial = 2650000;
		double valorDesconto = 2000;
		double valorEsperado = 66236.85;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	
	/*Faixa 5*/
	@Test
	public void TesteCalculoImovelTerritorialFaixa5_2 () {
		//Dados de entrada 
		TipoImovel tipoImovel = TipoImovel.NAO_RESIDENCIAL;
		double valorInicial = 100650000;
		double valorDesconto = 10000;
		double valorEsperado = 1598455.20;
		
		// Execucao do metodo
		CalculadoraIPTUService calculadoraIPTUService = new CalculadoraIPTUService();
		double valorObtido = calculadoraIPTUService.calcularIPTU(tipoImovel, valorInicial, valorDesconto);
		
		// Verificacao do teste
		assertEquals(valorEsperado, valorObtido, 0.00);	
	}
	
	
	@Test
	public void TesteAliquota1 () {
		//Dados de entrada 
		double valorEsperado = 534.63;
		
		// Execucao do metodo
		TipoImovel ti = TipoImovel.NAO_RESIDENCIAL;
		double aliquota = 1.2;
		double valorInicial = 0.00;
		double valorFinal = 35793.00;
						
		FaixaCalculo fc = new FaixaCalculo(ti, aliquota, valorInicial, valorFinal);
			
		// Verificacao do teste
		assertEquals(aliquota, fc.getAliquota(), 0.00);	
		assertEquals(valorInicial, fc.getValorInicial(), 0.00);	
		assertEquals(valorFinal, fc.getValorFinal(), 0.00);	
		assertEquals("", ti, fc.getTipoImovel());	
			
	}

		
}
