package aula4.impostos;

public class Iss extends Imposto {
	public Iss() {
		super();
	}
	
	public Iss(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return calculaIss(orcamento) + calculoDoOutroImposto(orcamento);
	}

	private double calculaIss(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 ;
	}
}
	