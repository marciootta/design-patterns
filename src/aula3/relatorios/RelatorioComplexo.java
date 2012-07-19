package aula3.relatorios;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected void imprimeCabecalho(Banco banco) {
		System.out.println(banco.getNomeBanco());
		System.out.println(banco.getEndereco());
		System.out.println(banco.getTelefone());
		System.out.println("--------------------------------");		
	}

	@Override
	protected void imprimeCorpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular:" + conta.getNomeTitular() +
							   " - Agencia/Conta:" + conta.getAgencia() + "/" + conta.getConta() +
							   " - Saldo: " + conta.getSaldo());
		}
	}

	@Override
	protected void imprimeRodape(Banco banco) {
		System.out.println("--------------------------------");		
		System.out.println(banco.getEmail());		 
		System.out.println(dataAtual()); 
	}

	private String dataAtual() {
		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat formatador = new SimpleDateFormat();
		return formatador.format(data);
	}
}
