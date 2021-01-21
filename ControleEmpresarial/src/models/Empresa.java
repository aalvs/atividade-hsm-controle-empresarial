package models;

public class Empresa {
	protected String nome;
	protected String cnpj;
	protected String dataInauguracao;
	protected Socios[] socios;
	protected double faturamentoAnual = Sede.this.getFaturamentoSede() + Filiais.this.getFaturamentoFilial();
	
	public Empresa(String nome, String cnpj, String dataInauguracao, Socios[] socios) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.dataInauguracao = dataInauguracao;
		this.socios = socios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(String dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	public Socios[] getSocios() {
		return socios;
	}

	public void setSocios(Socios[] socios) {
		this.socios = socios;
	}
	
	
}
