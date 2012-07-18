package Aula2_Bancaria;

public class Conta {
	private final String nomeTitular;
	private final double saldo;

	public Conta(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
}
