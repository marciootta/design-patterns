package aula7_observer.nota;

public class Multiplicador implements AcaoAposGeracaoNF {

	private int fator;
	public Multiplicador(int fator) {
		this.fator = fator;
	}
	@Override
	public void executa(NotaFiscal nota) {
		System.out.println(nota.getValorBruto() * fator);		
	}
}
