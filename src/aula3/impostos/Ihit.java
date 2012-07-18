package aula3.impostos;

import java.util.List;

public class Ihit extends TemplateDeImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (temDoisOuMaisItensComMesmoNome(orcamento));
	}

	@Override
	protected double calculaMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected double calculaMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * orcamento.getItens().size() * 0.01;
	}
	
	private boolean temDoisOuMaisItensComMesmoNome(Orcamento orcamento) {
		List<Item> lstItens = orcamento.getItens();
		if ( lstItens.size() >= 2 ) {
			for (int i=0; i<lstItens.size()-1; i++) {
				for (int j=i+1; j<lstItens.size(); j++) {
					if ( lstItens.get(i).getNome() == lstItens.get(j).getNome())
						return true;
				}
			}
		}
		return false;
	}
}
