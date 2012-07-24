package aula4.impostos;

public class TestaDecorator {
	public static void main(String[] args) {
		testeIcmsIss();
		testeImpostoMuitoAltoIssIcms();
		testeImpostoCondicional();
	}

	private static void testeImpostoCondicional() {
		Icpp icpp = new Icpp();
		Ikcv ikcv = new Ikcv(icpp);
		Orcamento orcamento = new Orcamento(2000);
		orcamento.AdicionaItem(new Item("CANETA", 20));
		orcamento.AdicionaItem(new Item("DE OURO", 120));
		double calcula = ikcv.calcula(orcamento);
		System.out.println(calcula);
	}

	private static void testeIcmsIss() {
		Icms icms = new Icms();
		Iss iss = new Iss(icms);
		double retorno = iss.calcula(new Orcamento(500.00));
		System.out.println(retorno);
	}
	private static void testeImpostoMuitoAltoIssIcms() {
		ImpostoMuitoAlto impostoMuitoAlto = new ImpostoMuitoAlto(new Icms(new Iss()));
		double valor = impostoMuitoAlto.calcula(new Orcamento(1000));
		
		System.out.println(valor);
	}
}
