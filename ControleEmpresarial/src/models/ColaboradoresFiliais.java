package models;

public class ColaboradoresFiliais extends ColaboradoresSede {

	public ColaboradoresFiliais(String matricula, String nomeCompleto, String salarioAnual) {
		super(matricula, nomeCompleto, salarioAnual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return super.getMatricula();
	}

	@Override
	public void setMatricula(String matricula) {
		// TODO Auto-generated method stub
		super.setMatricula(matricula);
	}

	@Override
	public String getNomeCompleto() {
		// TODO Auto-generated method stub
		return super.getNomeCompleto();
	}

	@Override
	public void setNomeCompleto(String nomeCompleto) {
		// TODO Auto-generated method stub
		super.setNomeCompleto(nomeCompleto);
	}

	@Override
	public String getSalarioAnual() {
		// TODO Auto-generated method stub
		return super.getSalarioAnual();
	}

	@Override
	public void setSalarioAnual(String salarioAnual) {
		// TODO Auto-generated method stub
		super.setSalarioAnual(salarioAnual);
	}
	
	
}
