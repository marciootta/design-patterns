package aula5.state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� finalizado");
	}
	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� finalizado");	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� finalizado");	
	}
	public String getDescricao() {
		return "Finalizado";
	}
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento finalizado nao pode ter desconto extra");
	}
}
