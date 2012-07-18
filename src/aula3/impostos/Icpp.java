package aula3.impostos;

public class Icpp extends TemplateDeImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() >= 500);
	}

	@Override
	protected double calculaMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected double calculaMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}
