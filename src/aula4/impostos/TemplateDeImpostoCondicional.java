package aula4.impostos;

public abstract class TemplateDeImpostoCondicional extends Imposto  {
	public TemplateDeImpostoCondicional() {
		super();
	}
	public TemplateDeImpostoCondicional(Imposto outro) {
		super(outro);
	}
	public double calcula (Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return calculaMaximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} 
		else 
			return calculaMinimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
	}
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	protected abstract double calculaMaximaTaxacao(Orcamento orcamento);
	protected abstract double calculaMinimaTaxacao(Orcamento orcamento);
}
