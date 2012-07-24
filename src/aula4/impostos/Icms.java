package aula4.impostos;

public class Icms extends Imposto {
	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}
	public Icms() {
		super();
	}
	@Override
	public double calcula(Orcamento orcamento) {
		return calculoIcms(orcamento) + calculoDoOutroImposto(orcamento);	
	}

	private double calculoIcms(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50;
	}
}
