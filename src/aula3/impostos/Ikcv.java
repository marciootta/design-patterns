package aula3.impostos;

public class Ikcv extends TemplateDeImpostoCondicional {

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
