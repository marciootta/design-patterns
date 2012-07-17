package Aula2_Descontos;

public class CalculadorDeDescontos {
	public double calculaDesconto(Orcamento orcamento) {
		
		DescontoMais5Itens descontoMais5Itens = new DescontoMais5Itens();
		DescontoMais500Reais descontoMais500Reais = new DescontoMais500Reais();
		DescontoPorVendaCasada descontoPorVendaCadada = new DescontoPorVendaCasada();
		descontoMais5Itens.setProximo(descontoMais500Reais);
		descontoMais500Reais.setProximo(descontoPorVendaCadada);
		descontoPorVendaCadada.setProximo(new SemDesconto());
		
		double valor = descontoMais5Itens.desconta(orcamento);
		return valor;
	}
}
