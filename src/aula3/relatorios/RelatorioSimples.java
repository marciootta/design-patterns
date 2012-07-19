package aula3.relatorios;

import java.util.List;

public class RelatorioSimples extends TemplateRelatorio {
	@Override
	protected void imprimeCabecalho(Banco banco) {
		System.out.println(banco.getNomeBanco());
		System.out.println("--------------------------------");
	}
	@Override
	protected void imprimeCorpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular:" + conta.getNomeTitular() + " - Saldo: " + conta.getSaldo());
		}
	}
	@Override
	protected void imprimeRodape(Banco banco) {
		System.out.println("--------------------------------");
		System.out.println(banco.getTelefone());
	}
}
