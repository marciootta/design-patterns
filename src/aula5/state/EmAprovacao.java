package aula5.state;

public class EmAprovacao implements EstadoDeUmOrcamento {
	private boolean jaDeuDesconto;
	
	public EmAprovacao() {
		jaDeuDesconto = false;
	}
	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual= new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovacao nao pode ir para finalizado direto!");
	}
	public String getDescricao() {
		return "Em Aprovação";
	}	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!jaDeuDesconto) {
			orcamento.valor -= orcamento.valor * 0.05;
			jaDeuDesconto = true;
		}
		else {
			throw new RuntimeException("Desconto ja foi concedido");
		}
	}
}
