package aula7_observer.nota;

public class EnviadorEmail implements AcaoAposGeracaoNF {
	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("enviei email");
	}
}
