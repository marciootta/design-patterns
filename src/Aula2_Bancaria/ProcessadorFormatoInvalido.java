package Aula2_Bancaria;

public class ProcessadorFormatoInvalido implements Processador {

	@Override
	public void geraNoFormato(Requisicao requisicao, Conta conta) {
		System.out.println("formato inv�lido");
	}

	@Override
	public void setProximo(Processador processador) {
		// void		
	}
}
