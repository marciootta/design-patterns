package Aula1_Investimentos;

import java.util.Random;

public class Arrojado implements Investimento {
	@Override
	public double investe(Conta conta) {
		Random randomno = new Random();	
		double chances = randomno.nextDouble();
		if (chances < 0.2) {
			return conta.getValor() * 0.05;			
		} else if (chances < 0.5) {
			return conta.getValor() * 0.03;
		} else {
			return conta.getValor() * 0.006;			
		}
	}
}
