package aula4.filtros;


import java.util.ArrayList;
import java.util.List;

public class FiltroMenor100 extends Filtro {
	public FiltroMenor100(Filtro novoFiltro) {
		super(novoFiltro);
	}

	public FiltroMenor100() {}

	@Override
	protected List<Conta> filtraConta(List<Conta> contas) {
		List<Conta> lstContas = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getSaldo() < 100.0)
				lstContas.add(conta);				
		}
		return lstContas;
	}
}
