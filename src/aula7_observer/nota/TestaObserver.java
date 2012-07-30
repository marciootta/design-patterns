package aula7_observer.nota;

import java.util.Arrays;

public class TestaObserver {
	public static void main(String[] args) {
		// NotaFiscalBuilder builder = new NotaFiscalBuilder();
		// builder.adicionaAcao(new NotaFiscalDao());
		// builder.adicionaAcao(new EnviadorEmail());
		// builder.adicionaAcao(new Multiplicador(3));
		NotaFiscalBuilder builder = new NotaFiscalBuilder(Arrays.asList(
				new NotaFiscalDao(), new EnviadorEmail(), new Multiplicador(3)));

		NotaFiscal nf = builder
				.paraEmpresa("72.877/0001-02", "LOJAO DO MARIANO")
				.comObservacoes("obs").comItem(new ItemDaNota("JUJUBA", 2))
				.comItem(new ItemDaNota("BALA KIDS", 2.5)).constroi();
		System.out.println(nf.getValorBruto());
	}
}
