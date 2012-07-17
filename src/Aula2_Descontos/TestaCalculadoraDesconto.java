package Aula2_Descontos;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestaCalculadoraDesconto {

	@Test
	public void DescontoMais500() {
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.AdicionaItem(new Item("ISCA JUANITA", 130));
		orcamento.AdicionaItem(new Item("LINHA VEXTER", 470));
		
		CalculadorDeDescontos calcula = new CalculadorDeDescontos();
		double desconto = calcula.calculaDesconto(orcamento);
		assertEquals(600*0.07, desconto, 0.0001);
	}
	@Test
	public void DescontoMais5Itens() {
		Orcamento orcamento = new Orcamento(700.0);
		orcamento.AdicionaItem(new Item("ISCA JUANITA", 130));
		orcamento.AdicionaItem(new Item("LINHA VEXTER", 100));
		orcamento.AdicionaItem(new Item("LINHA RAPALA", 100));
		orcamento.AdicionaItem(new Item("TESOURA MARINE", 70));
		orcamento.AdicionaItem(new Item("MALA PLANO", 200));
		orcamento.AdicionaItem(new Item("LINHA SUMAX", 100));
		
		CalculadorDeDescontos calcula = new CalculadorDeDescontos();
		double desconto = calcula.calculaDesconto(orcamento);
		assertEquals(700*0.1, desconto, 0.0001);
	}
	@Test
	public void DescontoVendaCasada() {
		Orcamento orcamento = new Orcamento(300.0);
		orcamento.AdicionaItem(new Item("MALA PLANO", 200));
		orcamento.AdicionaItem(new Item("LAPIS", 30));
		orcamento.AdicionaItem(new Item("CANETA", 60));
		
		CalculadorDeDescontos calcula = new CalculadorDeDescontos();
		double desconto = calcula.calculaDesconto(orcamento);
		assertEquals(15, desconto, 0.0001);
	}
}
