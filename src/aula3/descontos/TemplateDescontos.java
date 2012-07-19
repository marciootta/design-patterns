package aula3.descontos;



public abstract class TemplateDescontos implements Desconto {
	protected Desconto proximo;
	public final double desconta(Orcamento orcamento) {
		if (deveConcederDesconto(orcamento)) {
			return calculaoDesconto(orcamento);
		} 
		else if (proximo != null) {
			proximo.desconta(orcamento);
		}
		return 0;			
	}
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	protected abstract boolean deveConcederDesconto(Orcamento orcamento);
	protected abstract double calculaoDesconto(Orcamento orcamento);
}
