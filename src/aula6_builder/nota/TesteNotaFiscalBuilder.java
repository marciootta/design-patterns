package aula6_builder.nota;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TesteNotaFiscalBuilder {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		Calendar minhaData = Calendar.getInstance();
		minhaData.set(2012, 06, 30);
		builder.paraEmpresa("98.088.0001-89","casa das meias")
			.comObservacoes("nada a observar")
			.naData(minhaData)
			.comItem(new ItemDaNota("prego 35x18", 23.10))
			.comItem(new ItemDaNota("argamassa cimentcola", 32.50))
			.comItem(new ItemDaNota("areia fina lavada", 18));
		// apenas para usar o itemdanotabuilder
		ItemDaNotaBuilder itemBuilder = new ItemDaNotaBuilder();
		itemBuilder.comDescricao("ripa 10x3m")
				.comValor(20);
		ItemDaNota itemNovo = itemBuilder.constroi();
		builder.comItem(itemNovo);
		
		NotaFiscal minhaNota = builder.constroi();
		System.out.println(minhaNota.getValorBruto());
		SimpleDateFormat formata = new SimpleDateFormat();		
		System.out.println(formata.format(minhaNota.getDataEmissao().getTimeInMillis() ));
	}
}
