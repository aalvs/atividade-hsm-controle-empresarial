package models;

public class ColaboradoresSede {
	private String matricula;
	private String nomeCompleto;
	private String salarioAnual;
	
	public ColaboradoresSede(String matricula, String nomeCompleto, String salarioAnual) {
		super();
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.salarioAnual = salarioAnual;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(String salarioAnual) {
		this.salarioAnual = salarioAnual;
	}
	
	
}
