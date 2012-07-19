package aula3.relatorios;

  

public class TestaRelatorios {

	public static void main(String[] args) {
		//testRelatorioSimples();
		testRelatorioComplexo();
	}
	
	public static void testRelatorioSimples() {
		RelatorioSimples relatorioSimples = new RelatorioSimples();
		Banco banco = new Banco("Banco do Iraque", "(21) 9887-8762");
		banco.setEmail("email@bancodoiraque.com");
		banco.setEndereco("Rua dos Aiatolas, 282, Bagda");
		
		banco.adicionaConta(new Conta("Hoseh da Silva", 23908.19));
		banco.adicionaConta(new Conta("Mohahmed Aiatoal Kalifha", 4981.10));
		banco.adicionaConta(new Conta("Jurahmed Aiatoal Kalifha", 491.10));
		banco.adicionaConta(new Conta("Kohlamola Aiatoal Kalifha", 1212321.56));
		banco.adicionaConta(new Conta("Jujuba Jorgal Beneth", 12412.45));
		relatorioSimples.imprimeRelatorio(banco, banco.getListaContas());
	}
	public static void testRelatorioComplexo() {
		RelatorioComplexo relatorioComplexo = new RelatorioComplexo();
		Banco banco = new Banco("Banco do Iraque", "(21) 9887-8762");
		banco.setEmail("email@bancodoiraque.com");
		banco.setEndereco("Rua dos Aiatolas, 282, Bagda");
		
		banco.adicionaConta(new Conta("Hoseh da Silva", 23908.19, 9871, "10492-7"));
		banco.adicionaConta(new Conta("Mohahmed Aiatoal Kalifha", 4981.10, 511, "958123-7"));
		banco.adicionaConta(new Conta("Jurahmed Aiatoal Kalifha", 491.10, 512, "98512-2"));
		banco.adicionaConta(new Conta("Kohlamola Aiatoal Kalifha", 1212321.56, 23, "12319-8"));
		banco.adicionaConta(new Conta("Jujuba Jorgal Beneth", 12412.45, 551, "12519-5"));
		relatorioComplexo.imprimeRelatorio(banco, banco.getListaContas());
	}

}
