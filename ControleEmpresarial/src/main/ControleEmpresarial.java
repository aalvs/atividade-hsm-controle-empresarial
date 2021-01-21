package main;

import models.ColaboradoresFiliais;
import models.ColaboradoresSede;
import models.Empresa;
import models.Filiais;
import models.Sede;
import models.Socios;

public class ControleEmpresarial {

	public static void main(String[] args) {
		
		Socios[] socios = new Socios[5];
		socios[0] = new Socios("André", "000.000.000-00", "4190000000","00/00/0000");
		socios[1] = new Socios("José", "000.000.000-00", "4190000000","00/00/0000");
		socios[2] = new Socios("Maria", "000.000.000-00", "4190000000","00/00/0000");
		socios[3] = new Socios("Pedro", "000.000.000-00", "4190000000","00/00/0000");
		socios[4] = new Socios("João", "000.000.000-00", "4190000000","00/00/0000");
		
		ColaboradoresSede[] colaboradoresSede = new ColaboradoresSede[5];
		colaboradoresSede[0] = new ColaboradoresSede("01", "Marcus", "3500");
		colaboradoresSede[1] = new ColaboradoresSede("02", "Jorge", "2500");
		colaboradoresSede[2] = new ColaboradoresSede("03", "Paulo", "5500");
		colaboradoresSede[3] = new ColaboradoresSede("04", "Carlos", "1500");
		colaboradoresSede[4] = new ColaboradoresSede("05", "Lucas", "1500");
		
		ColaboradoresFiliais[] colaboradoresFilial1 = new ColaboradoresFiliais[3];
		colaboradoresFilial1[0] = new ColaboradoresFiliais("01", "Leandro", "5500");
		colaboradoresFilial1[1] = new ColaboradoresFiliais("02", "Monica", "3500");
		colaboradoresFilial1[2] = new ColaboradoresFiliais("03", "Bruna", "2500");
		
		ColaboradoresFiliais[] colaboradoresFilial2 = new ColaboradoresFiliais[3];
		colaboradoresFilial2[0] = new ColaboradoresFiliais("01", "Mario", "5500");
		colaboradoresFilial2[1] = new ColaboradoresFiliais("02", "Fernanda", "3500");
		colaboradoresFilial2[2] = new ColaboradoresFiliais("03", "Natasha", "2500");
		
		ColaboradoresFiliais[] colaboradoresFilial3 = new ColaboradoresFiliais[3];
		colaboradoresFilial3[0] = new ColaboradoresFiliais("01", "Felipe", "5500");
		colaboradoresFilial3[1] = new ColaboradoresFiliais("02", "Rafael", "3500");
		colaboradoresFilial3[2] = new ColaboradoresFiliais("03", "Luiz", "2500");
		
		
		Filiais[] filiais = new Filiais[3];
		filiais[0] = new Filiais("Leandro",30.000,"Rua Hartwing Muller, nº000 - Novo Mundo","123", colaboradoresFilial1);
		filiais[1] = new Filiais("Monica",50.000,"Rua Hartwing Muller, nº000 - Novo Mundo","456", colaboradoresFilial2);
		filiais[2] = new Filiais("Bruna",60.000,"Rua Hartwing Muller, nº000 - Novo Mundo","789", colaboradoresFilial3);
		
		Empresa empresa = new Empresa("Becode","00.000.000/0001-00","19/01/2021",socios);
		
		Sede sede = new Sede(200.000,colaboradoresSede,filiais );
		
		
	}

}
