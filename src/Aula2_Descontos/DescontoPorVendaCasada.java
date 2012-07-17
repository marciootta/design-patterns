package Aula2_Descontos;

public class DescontoPorVendaCasada implements Desconto {
	private Desconto proximo;
	@Override
	public double desconta(Orcamento orcamento) {
		
		if (contem("LAPIS", orcamento) && contem("CANETA", orcamento)) {
			return orcamento.getValor() * 0.05;
		}		
		return proximo.desconta(orcamento);
	}
	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}	
	private Boolean contem (String nomeProcurado, Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if (item.getNome() == nomeProcurado)
				return true;
		}
		return false;
	}
}
