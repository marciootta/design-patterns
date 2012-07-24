package aula4.impostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	private double valor;
	private final List<Item> itens;


	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}
	public double getValor() {
		return valor;
	}
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}	
	public void AdicionaItem(Item item) {
		itens.add(item);
	}
}
