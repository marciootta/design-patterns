package Aula1_Impostos;

public class Iss implements Imposto {
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
