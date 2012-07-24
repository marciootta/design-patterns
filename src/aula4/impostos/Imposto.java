package aula4.impostos;

public abstract class Imposto {
	protected Imposto outroImposto;

	public Imposto (Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	public Imposto() {
		this.outroImposto = null;
	}
	
	protected abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto != null)
			return outroImposto.calcula(orcamento);
		else
			return 0;
	}
}
