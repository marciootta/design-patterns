package Aula1_Investimentos;
import java.util.*;

public class Moderado implements Investimento{
	@Override
	public double investe(Conta conta) {
		Random randomno = new Random();		
		boolean escolhido = randomno.nextDouble() > 0.50;
		if (escolhido) {
			return conta.getValor() * 0.025; 
		} else {
			return conta.getValor() * 0.007;			
		}
	}
}
