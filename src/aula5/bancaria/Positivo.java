package aula5.bancaria;

public class Positivo implements EstadoDeConta {
	@Override
	public void saca(Conta conta, Double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
		if (conta.getSaldo() < 0)
			conta.estadoAtual = new Negativo();
	}
	@Override
	public void deposita(Conta conta, Double valor) {
		conta.setSaldo(conta.getSaldo() + valor * 0.98);
	}
}
