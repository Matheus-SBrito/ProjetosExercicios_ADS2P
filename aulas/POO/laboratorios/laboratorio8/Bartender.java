package aulas.POO.laboratorios.laboratorio8;

import java.util.Scanner;

public class Bartender{
	
	public Bebida prepararBbebida() throws Exception{
		Scanner scanner=new Scanner(System.in);
		System.out.println("selecione o tipo de bebida: \n1- Pitu;\n2- Uísque");
		Bebida bebida;

		switch(scanner.nextLine()) {
		case "1":
			bebida=new Pitu();
		case"2":
			bebida=new Uisque();
		default:
			break;
		}
	boolean opcao= true;
		do {
			System.out.println("Menu:"
					+ "\n(1)- incluir Limão"
					+ "\n(2) – incluir Sal"
					+ "\n(3) - Não inlcluir mais adicional");
		switch(scanner.nextLine()) {
		case "1":
			bebida= new Limao(bebida);
			break;
		case"2":
			bebida= new Sal(bebida);
			break;
		case"3":
			opcao=false;
			break;
		default:
			break;
		}}while(opcao);
	
		if(bebida.getTeorAlcoolico()>1.2f) {
			throw new AlcoolDemaisException();
		} else if (bebida.getTeorAlcoolico()<0) {
			throw new AlcoolDemaisException();
		} else
			return bebida;
	
}
}
