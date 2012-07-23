package aula4.filtros;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class FiltroDataAbertura extends Filtro {
	public FiltroDataAbertura() {
	}
	public FiltroDataAbertura(Filtro novoFiltro) {
		super(novoFiltro);
	}
	protected List<Conta> filtraConta(List<Conta> contas) {
		List<Conta> retorno = new ArrayList<Conta>(); 
		for (Conta conta : contas) {
			
			if (dataAberturaNesteMes(conta.getDataAbertura())) {
				retorno.add(conta);
			}
		}
		return retorno;
	}

	private boolean dataAberturaNesteMes(Calendar dataAbertura) {
		if (dataAbertura != null) { 
			GregorianCalendar cal = (GregorianCalendar)dataAbertura;
			GregorianCalendar theDate = (GregorianCalendar) Calendar.getInstance();
			return ( cal.get(Calendar.MONTH) == theDate.get(Calendar.MONTH) &&
					 cal.get(Calendar.YEAR) == theDate.get(Calendar.YEAR) );
		}
		else
			return false;
	}
}
