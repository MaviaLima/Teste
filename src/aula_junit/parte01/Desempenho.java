package aula_junit.parte01;

public class Desempenho {

	public boolean verificarAprovacao(float nota1, float nota2, 
			float frequencia) throws ValorInvalidoException {
		boolean resultado = false;
		if (nota1 < 0 || nota1 > 10) {
			throw new ValorInvalidoException(nota1);
		}
		if (nota2 < 0 || nota2 > 10) {
			throw new ValorInvalidoException(nota2);
		}
		if (frequencia < 0 || frequencia > 1) {
			throw new ValorInvalidoException(frequencia);
		}
		float media = (nota1 + nota2) / 2;
		if (frequencia < 0.75){
			resultado = false;
		} else {
			if (media >= 7.0){
				resultado = true;
			}
		}
		return resultado;
	}
	
	
}
