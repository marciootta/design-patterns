package aula5.bancaria;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta("marcio", 400);
		conta.saca(500.0);
		conta.saca(100.0);
		conta.deposita(120);
	}
}
