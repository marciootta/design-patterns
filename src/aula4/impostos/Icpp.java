package aula4.impostos;

public class Icpp extends TemplateDeImpostoCondicional {
	public Icpp(){
		super();
	}
	public Icpp(Imposto outro) {
		super(outro);
	}
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
