package aula3.relatorios;

public class Conta {
	private final String nomeTitular;
	private final double saldo;




	private Integer agencia;
	private String conta;

	public Conta(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;	
	}
	public Conta(String nomeTitular, double saldo, Integer agencia, String conta) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;	
		setAgencia(agencia);
		setConta(conta);
	}
	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	public Integer getAgencia() {
		return agencia;
	}

	public String getConta() {
		return conta;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
}
