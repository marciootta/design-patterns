package aula4.filtros;
import java.util.List;
 
public abstract class Filtro {
	private Filtro proximoFiltro = null;
	public Filtro() {}
	public Filtro(Filtro novoFiltro) {
		this.proximoFiltro = novoFiltro;
	}
	
	// template de filtragem de contas
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = filtraConta(contas);
		if (proximoFiltro != null ) {
			filtrada.addAll(proximoFiltro.filtra(contas));
			return  filtrada;
		}
		else
			return filtrada;				
	}
	protected abstract List<Conta> filtraConta(List<Conta> contas);
}
