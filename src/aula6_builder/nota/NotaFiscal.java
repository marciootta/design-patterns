package aula6_builder.nota;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private Calendar dataEmissao;
	private double impostos;
	private String observacoes;
	private List<ItemDaNota> itens;
	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto,
			Calendar dataEmissao, double impostos, String observacoes,
			List<ItemDaNota> itens) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.dataEmissao = dataEmissao;
		this.impostos = impostos;
		this.observacoes = observacoes;
		this.itens = itens;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public double getImpostos() {
		return impostos;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}

}
