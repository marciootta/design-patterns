package aula3.impostos;


import org.junit.Assert;
import org.junit.Test;


public class TestadorImpostosCondicionais {
	private Orcamento orcamento;

	@Test
	public void testaIcppCalcula500() {
		orcamento = new Orcamento(500);
		Icpp icpp = new Icpp();
		double impostoCalculado = icpp.calcula(orcamento);
		Assert.assertEquals(500 * 0.07, impostoCalculado, 0.00001);
	}
	@Test
	public void testaIcppCalculaMenor500() {
		orcamento = new Orcamento(400);
		Icpp icpp = new Icpp();
		double impostoCalculado = icpp.calcula(orcamento);
		Assert.assertEquals(400 * 0.05, impostoCalculado, 0.00001);
	}
	@Test
	public void testaIcppCalculaMaior500() {
		orcamento = new Orcamento(600);
		Icpp icpp = new Icpp();
		double impostoCalculado = icpp.calcula(orcamento);
		Assert.assertEquals(600 * 0.07, impostoCalculado, 0.00001);
	}
	@Test
	public void testaIkcvMin() {		
		orcamento = new Orcamento(600);
		orcamento.AdicionaItem(new Item("coisa", 90));
		orcamento.AdicionaItem(new Item("coisa2", 80));
		Ikcv ikcv = new Ikcv();
		double impostoCalculado = ikcv.calcula(orcamento);
		Assert.assertEquals(600*0.06, impostoCalculado, 0.000001);
	}
	@Test
	public void testaIkcvMax() {		
		orcamento = new Orcamento(600);
		orcamento.AdicionaItem(new Item("coisa", 90));
		orcamento.AdicionaItem(new Item("coisa2", 180));
		Ikcv ikcv = new Ikcv();
		double impostoCalculado = ikcv.calcula(orcamento);
		Assert.assertEquals(600*0.10, impostoCalculado, 0.000001);
	}
	@Test
	public void testaIhitMin() {
		orcamento = new Orcamento(600);
		orcamento.AdicionaItem(new Item("coisa", 90));
		orcamento.AdicionaItem(new Item("coisa2", 180));
		orcamento.AdicionaItem(new Item("coisa3", 40));
		orcamento.AdicionaItem(new Item("coisa4", 40));
		Ihit ihit = new Ihit();
		double calculado = ihit.calcula(orcamento);
		Assert.assertEquals(orcamento.getValor() * 0.04, calculado, 0.00001);
	}
	@Test
	public void testaIhitMax() {
		orcamento = new Orcamento(600);
		orcamento.AdicionaItem(new Item("coisa", 90));
		orcamento.AdicionaItem(new Item("coisa2", 180));
		orcamento.AdicionaItem(new Item("coisa3", 40));
		orcamento.AdicionaItem(new Item("coisa4", 40));
		orcamento.AdicionaItem(new Item("coisa4", 41));
		Ihit ihit = new Ihit();
		double calculado = ihit.calcula(orcamento);
		Assert.assertEquals(orcamento.getValor() * 0.13 + 100, calculado, 0.00001);
	}
}
