package Aula2_Bancaria;

public class ProcessadorPorcento implements Processador {
	public ProcessadorPorcento(Processador proximo) {
		setProximo(proximo);
	}

	private Processador proximo;
	@Override
	public void geraNoFormato(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.PORCENTO)
		{
			System.out.println(conta.getNomeTitular() + "%" + conta.getSaldo());
		}
		else
			proximo.geraNoFormato(requisicao, conta);
	}

	@Override
	public void setProximo(Processador processador) {
		this.proximo = processador;		
	}
}
