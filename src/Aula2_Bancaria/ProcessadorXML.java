package Aula2_Bancaria;

public class ProcessadorXML implements Processador{
	public ProcessadorXML(Processador proximo) {
		setProximo(proximo);
	}

	private Processador proximo;
	@Override
	public void geraNoFormato(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.XML)
		{
			System.out.println("<CONTA><TITULAR>" + conta.getNomeTitular() + "</TITULAR><SALDO>" + conta.getSaldo() + "</SALDO></CONTA>");
		}
		else
			proximo.geraNoFormato(requisicao, conta);
	}

	@Override
	public void setProximo(Processador processador) {
		this.proximo = processador;		
	}
}
