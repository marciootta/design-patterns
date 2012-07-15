package Aula1_Investimentos;

public class RealizadordeInvestimentos {
	public void realizaInvestimento(Conta conta, Investimento investimento) {
		double rendimentoBruto = investimento.investe(conta);
		System.out.println("rendeu " +  rendimentoBruto / conta.getValor()  );
		conta.setValor(conta.getValor() + (rendimentoBruto * 0.75));
		System.out.println(conta.getValor());
	}
}
