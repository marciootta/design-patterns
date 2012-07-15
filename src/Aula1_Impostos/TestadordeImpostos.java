package Aula1_Impostos;

public class TestadordeImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		Iss iss = new Iss();
		Icms icms = new Icms();
		Iccc iccc = new Iccc();
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);		
	}
}
