package aula3.relatorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	private String telefone;
	private String nomeBanco;
	private String email;
	private String endereco;
	private List<Conta> listaContas;
	
	public Banco(String nomeBanco, String telefone) {
		this.nomeBanco = nomeBanco;
		this.telefone = telefone;
		listaContas = new ArrayList<Conta>();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Conta> getListaContas() {
		return Collections.unmodifiableList(listaContas);
	}

	public void adicionaConta(Conta conta) {
		listaContas.add(conta);
	}
}
