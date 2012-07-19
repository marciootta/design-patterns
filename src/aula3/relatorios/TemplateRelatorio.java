package aula3.relatorios;
import java.util.List;

public abstract class TemplateRelatorio {
	public void imprimeRelatorio(Banco banco, List<Conta> contas) {
		imprimeCabecalho(banco);
		imprimeCorpo(contas);
		imprimeRodape(banco);
	}
	protected abstract void imprimeCabecalho(Banco banco);	
	protected abstract void imprimeCorpo(List<Conta> contas);
	protected abstract  void imprimeRodape(Banco banco);
}
