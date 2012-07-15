package Aula1_Investimentos;

public class TestaInvestimento {
	public static void main(String[] args) {
		Conta conta = new Conta(5000);
		RealizadordeInvestimentos realizador = new RealizadordeInvestimentos();

		Conservador conservador = new Conservador();
		Moderado mode = new Moderado();
		Arrojado arro = new Arrojado();
		 
		realizador.realizaInvestimento(conta, conservador);
		realizador.realizaInvestimento(conta, mode);
		realizador.realizaInvestimento(conta, arro);
		
	}
}
