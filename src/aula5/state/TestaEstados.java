package aula5.state;

public class TestaEstados {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		System.out.println( orcamento.getDescricaoEstadoAtual());		
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		orcamento.aprova();
		System.out.println(orcamento.getDescricaoEstadoAtual());
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		orcamento.finaliza();
		System.out.println(orcamento.getDescricaoEstadoAtual());
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
	}
}
