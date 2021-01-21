package models;

public class Sede {
	private double faturamentoSede = 0;
	private ColaboradoresSede[] colaboradores;
	private Filiais[] filiais;

	public Sede(double faturamentoSede, ColaboradoresSede[] colaboradores, Filiais[] filiais) {
		super();
		this.faturamentoSede = faturamentoSede;
		this.colaboradores = colaboradores;
		this.filiais = filiais;
	}

	public double getFaturamentoSede() {
		return faturamentoSede;
	}

	public void setFaturamentoSede(double faturamentoSede) {
		this.faturamentoSede = faturamentoSede;
	}

	public ColaboradoresSede[] getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(ColaboradoresSede[] colaboradores) {
		this.colaboradores = colaboradores;
	}

	public Filiais[] getFiliais() {
		return filiais;
	}

	public void setFiliais(Filiais[] filiais) {
		this.filiais = filiais;
	}

	
	
}
