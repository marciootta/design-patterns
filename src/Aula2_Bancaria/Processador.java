package Aula2_Bancaria;

public interface Processador {
	public void geraNoFormato(Requisicao requisicao, Conta conta);
	public void setProximo(Processador processador);  
}
