package Aula1_Impostos;

public class CalculadorDeImpostos {
	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valor= imposto.calcula(orcamento);
		System.out.println(valor);
		return valor;
	}
}
