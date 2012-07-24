package aula4.impostos;

public class ImpostoMuitoAlto extends Imposto {
	public ImpostoMuitoAlto() {
		super();
	}
	public ImpostoMuitoAlto(Imposto outro) {
		super(outro);
	}
	@Override
	protected double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}
}
