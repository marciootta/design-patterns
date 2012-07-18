package aula3.impostos;

public abstract class TemplateDeImpostoCondicional {
	public double calcula (Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return calculaMaximaTaxacao(orcamento);
		} 
		else 
			return calculaMinimaTaxacao(orcamento);
	}
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	protected abstract double calculaMaximaTaxacao(Orcamento orcamento);
	protected abstract double calculaMinimaTaxacao(Orcamento orcamento);
}
