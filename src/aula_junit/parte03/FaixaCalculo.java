package aula_junit.parte03;

public class FaixaCalculo implements Comparable<FaixaCalculo>{

	private Integer codigo;
	private TipoImovel tipoImovel;
	private double valorInicial;
	private double valorFinal;
	private double aliquota;
	
	
	public FaixaCalculo(TipoImovel tipoImovel, double aliquota, double valorInicial,
			double valorFinal) {
		super();
		this.tipoImovel = tipoImovel;
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
		this.aliquota = aliquota;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public double getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public double getAliquota() {
		return aliquota;
	}
	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	@Override
	public int compareTo(FaixaCalculo o) {
		return new Double(valorInicial).compareTo(o.valorInicial);
	}
	@Override
	public String toString() {
		return "FaixaCalculo [tipoImovel=" + tipoImovel + ", valorInicial="
				+ valorInicial + ", valorFinal=" + valorFinal + ", aliquota="
				+ aliquota + "]";
	}
	
	
}
