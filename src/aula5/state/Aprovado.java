package aula5.state;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja esta aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

	@Override
	public String getDescricao() {
		return "Aprovado";
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02; 
	}
}
