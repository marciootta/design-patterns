package aula4.impostos;

public class Ikcv extends TemplateDeImpostoCondicional {
	public Ikcv() {
		super();
	}
	public Ikcv(Imposto outro) {
		super(outro);
	}
	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() > 500.0 && temMaiorQue100(orcamento)); 
	}
	@Override
	protected double calculaMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
	@Override
	protected double calculaMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	public boolean temMaiorQue100(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if (item.getValor() > 100) 
				return true;
		}
		return false;
	}
}
