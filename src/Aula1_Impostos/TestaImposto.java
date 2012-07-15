package Aula1_Impostos;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestaImposto {
	CalculadorDeImpostos calculador;
	Iccc iccc;
	Orcamento orcamento;
	
	@Before 
	public void startup() {
		iccc = new Iccc();
		calculador = new CalculadorDeImpostos();		
	}
	@Test
	public void IcccValorMenor1000() {
		orcamento = new Orcamento(800);
		assertEquals(800*0.05, calculador.realizaCalculo(orcamento, iccc), 0.0001);
	}
	@Test
	public void IcccValor3000() {
		orcamento = new Orcamento(3000);
		assertEquals(3000*0.07, calculador.realizaCalculo(orcamento, iccc), 0.0001);
	}
	@Test
	public void IcccValorMaior3000() {
		orcamento = new Orcamento(4000);
		assertEquals(4000*0.08+30, calculador.realizaCalculo(orcamento, iccc), 0.0001);
	}
}
