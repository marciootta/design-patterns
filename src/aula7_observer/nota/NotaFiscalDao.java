package aula7_observer.nota;

public class NotaFiscalDao implements  AcaoAposGeracaoNF {
	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("gravado no banco");
	}
}
