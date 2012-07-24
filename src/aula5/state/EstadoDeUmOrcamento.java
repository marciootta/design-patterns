package aula5.state;

public interface EstadoDeUmOrcamento {	
	public void aprova(Orcamento orcamento);
	public void reprova(Orcamento orcamento);
	public void finaliza(Orcamento orcamento);
	public String getDescricao();
	public void aplicaDescontoExtra(Orcamento orcamento);
}
