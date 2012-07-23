package aula4.filtros;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Conta {
	private final String nomeTitular;
	private final double saldo;
	private Calendar dataAbertura;

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
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public void setDataAbertura(int ano, int mes, int dia) {
		this.dataAbertura = new GregorianCalendar(ano, mes, dia);
	}
}
