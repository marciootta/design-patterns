package aula5.bancaria;

public class Conta {
	private final String nomeTitular;
	private double saldo;
	protected EstadoDeConta estadoAtual;

	public Conta(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		if (saldo < 0)
			estadoAtual = new Negativo();
		else
			estadoAtual = new Positivo();
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}	
	public void setSaldo(double valor) {
		saldo = valor;
	}
	public void deposita(double valor) {
		estadoAtual.deposita(this, valor);
	}	
	public void saca(double valor) {
		estadoAtual.saca(this, valor);
	}
}
