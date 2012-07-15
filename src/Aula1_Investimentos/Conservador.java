package Aula1_Investimentos;

public class Conservador implements Investimento {
	public double investe(Conta conta) {
		return conta.getValor() * 0.008;
	}
}
