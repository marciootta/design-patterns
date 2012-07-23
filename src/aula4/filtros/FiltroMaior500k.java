package aula4.filtros;

import java.util.ArrayList;
import java.util.List;

public class FiltroMaior500k extends Filtro {

	public FiltroMaior500k(Filtro novoFiltro) {
		super(novoFiltro);
	}
	public FiltroMaior500k() { }
	
	@Override
	protected List<Conta> filtraConta(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for(Conta conta:contas) {
			if (conta.getSaldo() > 500000)
				filtrada.add(conta);
		}
		return (filtrada);
	}
}
