package models;

public class Filiais{
	private String nomeResponsavel;
	private double faturamentoFilial = 0;
	private String endereco;
	private String codigo;
	private ColaboradoresFiliais[] colaboradores;
	
	public Filiais(String nomeResponsavel, double faturamentoFilial, String endereco, String codigo,
			ColaboradoresFiliais[] colaboradores) {
		super();
		this.nomeResponsavel = nomeResponsavel;
		this.faturamentoFilial = faturamentoFilial;
		this.endereco = endereco;
		this.codigo = codigo;
		this.colaboradores = colaboradores;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public double getFaturamentoFilial() {
		return faturamentoFilial;
	}

	public void setFaturamentoFilial(double faturamentoFilial) {
		this.faturamentoFilial = faturamentoFilial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ColaboradoresFiliais[] getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(ColaboradoresFiliais[] colaboradores) {
		this.colaboradores = colaboradores;
	}
	
	
	
	
	
}
