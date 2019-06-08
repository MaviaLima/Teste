package aula_junit.parte03;

import java.util.List;


public class CalculadoraIPTUService { 
	
	private FaixaCalculoDAO faixaDAO = new FaixaCalculoDAO();
	
	public double calcularIPTU(TipoImovel tipo, double valorImovel, double valorDesconto){
		
		double valorImposto = 0.0;
		double valorJaUtilizado = 0.0;
		
		List<FaixaCalculo> faixasPorTipo = faixaDAO.consultarFaixasPorTipoImovel(tipo);
		
		for (FaixaCalculo faixa : faixasPorTipo){
			if (valorImovel > faixa.getValorFinal()){
				double intervalo = faixa.getValorFinal() - faixa.getValorInicial(); 
				valorImposto += intervalo * (faixa.getAliquota() / 100);
				valorJaUtilizado += intervalo;
			} else {
				valorImposto += (valorImovel - valorJaUtilizado) * (faixa.getAliquota() / 100);
				break;
			}
		}
		return Util.arredondarValor(valorImposto - valorDesconto, 2);
	}
}
