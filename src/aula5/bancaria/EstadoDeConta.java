package aula5.bancaria;

public interface EstadoDeConta {

	public abstract void saca(Conta conta, Double valor);
	public abstract void deposita(Conta conta, Double valor);
}

