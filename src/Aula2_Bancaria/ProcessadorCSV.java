package Aula2_Bancaria;

public class ProcessadorCSV implements Processador {
	private Processador proximo;
	
	public ProcessadorCSV(Processador proximo) {
		setProximo(proximo);
	}
	public ProcessadorCSV() {
		setProximo(null);
	}
	
	@Override
	public void geraNoFormato(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.CSV) {
			System.out.println(conta.getNomeTitular() + "," + conta.getSaldo());
		}
		else 
			if (proximo != null)
				proximo.geraNoFormato(requisicao, conta);
			else
				 throw new RuntimeException("Formato de resposta não encontrado");
	}
 
	@Override
	public void setProximo(Processador processador) {
		this.proximo = processador;		
	}
}
