package Aula2_Bancaria;

public class TestaProcessadorRequisicao {
	public static void main(String[] args) {
		
		ProcessadorFormatoInvalido fim = new ProcessadorFormatoInvalido();
		ProcessadorPorcento porcento = new ProcessadorPorcento(fim);		
		ProcessadorXML xml = new ProcessadorXML(porcento);
		ProcessadorCSV csv =  new ProcessadorCSV(xml);
		
		Requisicao requisicao = new Requisicao(Formato.PORCENTO);
		csv.geraNoFormato(requisicao, new Conta("MARCIO", 300));
	}
}
