package aula5.bancaria;

public class Negativo implements EstadoDeConta {
	@Override
	public void saca(Conta conta, Double valor) {
		throw new RuntimeException("Contas negativas não aceitam saques");
	}
	@Override
	public void deposita(Conta conta, Double valor) {
		conta.setSaldo(conta.getSaldo() + valor * 0.95);
		if (conta.getSaldo() > 0)
			conta.estadoAtual = new Positivo();
	}
}
