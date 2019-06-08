package aula_junit.parte03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FaixaCalculoDAO {

	private List<FaixaCalculo> listaFaixas = new ArrayList<>();
	
	public FaixaCalculoDAO() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader("faixas.txt"));
			scanner.useDelimiter(";|\\r|\\n");
			while (scanner.hasNext()) {
				TipoImovel ti = TipoImovel.valueOf(scanner.next());
				double aliquota = scanner.nextDouble();
				double valorInicial = scanner.nextDouble();
				double valorFinal = scanner.nextDouble();
								
				FaixaCalculo fc = new FaixaCalculo(ti, aliquota, valorInicial, valorFinal);
				listaFaixas.add(fc);
				
//				System.out.println(ti);
//				System.out.println(aliquota);
//				System.out.println(valorInicial);
//				System.out.println(valorFinal);
				
				// quebra de linha
				scanner.next();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public List<FaixaCalculo> consultarFaixasPorTipoImovel(TipoImovel tipo) {
		List<FaixaCalculo> result = new ArrayList<>();
		for (FaixaCalculo fc : listaFaixas){
			if (fc.getTipoImovel() == tipo){
				result.add(fc);
			}			
		}
		Collections.sort(result);
		return result;
	}

}
