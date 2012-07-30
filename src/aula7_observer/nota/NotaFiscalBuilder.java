package aula7_observer.nota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String cnpj;
	private String razaoSocial;
	private String observacoes;
	private Calendar data;
	private List<ItemDaNota> itens;
	private double valorBruto;
	private double impostos;
	private List<AcaoAposGeracaoNF> acoesASerExecutadas;
	
	public NotaFiscalBuilder() {
		itens = new ArrayList<ItemDaNota>();
		valorBruto = 0;
		impostos = 0;
		this.data = Calendar.getInstance();
		acoesASerExecutadas = new ArrayList<AcaoAposGeracaoNF>();
	}
	public NotaFiscalBuilder(List<AcaoAposGeracaoNF> listaAcoes) {
		itens = new ArrayList<ItemDaNota>();
		valorBruto = 0;
		impostos = 0;
		this.data = Calendar.getInstance();
		acoesASerExecutadas = listaAcoes;
	}
	public void adicionaAcao(AcaoAposGeracaoNF acao) {
		acoesASerExecutadas.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;		
		return this;
	}
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;
		return this;
	}
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos = valorBruto * 0.06;
		return this;
	}
	public NotaFiscal constroi() {
		NotaFiscal nota = new NotaFiscal(razaoSocial,cnpj,valorBruto,data,impostos,observacoes,itens);
		
		for(AcaoAposGeracaoNF acao : acoesASerExecutadas) {
			acao.executa(nota);
		}
		return nota;
	}
}

