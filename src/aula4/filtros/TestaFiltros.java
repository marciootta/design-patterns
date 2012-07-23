package aula4.filtros;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestaFiltros {
	public static void main(String[] args) {
			
		FiltroMenor100 filtrosaldomenor100 = new FiltroMenor100();
		FiltroMaior500k filtroMaior500k = new FiltroMaior500k(filtrosaldomenor100);
		FiltroDataAbertura filtroDataAbertura = new FiltroDataAbertura(filtroMaior500k);
		
		List<Conta> contas = new ArrayList<Conta>();
		Conta conta2 = new Conta("JOSE", 2005);
		conta2.setDataAbertura(2012,Calendar.APRIL,01);
		contas.add(conta2);
		contas.add(new Conta("MARIO", 512));
		contas.add(new Conta("JANUARIO", 12512));
		contas.add(new Conta("FOFOLO", 561));
		contas.add(new Conta("ZEMANE", 61));
		Conta conta3 = new Conta("DON DUDA", 1204560);
		conta3.setDataAbertura(2012,Calendar.JULY,01); 
		contas.add(conta3);
		contas.add(new Conta("RAFA NADAL", 520456));
		contas.add(new Conta("POQUER PLAYER", -230));
		
		List<Conta> resultante = filtroDataAbertura.filtra(contas);
		for(Conta conta : resultante) {
			System.out.println("titular: " + conta.getNomeTitular() + " - saldo: " + conta.getSaldo());
		}
	}
}
