package aulas.POO.listas.semana12.ProjetoUsoDeInterfaces;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int dia, mes, ano;
		
		System.out.println("Digite o valor da 1º data (formato, 'DD/MM/YYYY'):");
		String[] dataTexto =  input.nextLine().split("/");
		
		dia = Integer.valueOf(dataTexto[0]);
		mes = Integer.valueOf(dataTexto[1]);
		ano = Integer.valueOf(dataTexto[2]);
		MinhaData data1 = new MinhaData (dia, mes, ano);
		
		System.out.println("Digite o valor da 2º data (formato, 'DD/MM/YYYY'):");
		dataTexto =  input.nextLine().split("/");
		
		dia = Integer.valueOf(dataTexto[0]);
		mes = Integer.valueOf(dataTexto[1]);
		ano = Integer.valueOf(dataTexto[2]);
		MinhaData data2 = new MinhaData (dia, mes, ano);
		
		switch (data1.comparacao(data2)) {
		
			case 0: System.out.println("Datas Iguais"); break;
			case 1: System.out.println("Datas:\n" + data2 + "\n" + data1); break;
			case 2: System.out.println("Datas:\n" + data1 + "\n" + data2); break;
			default: System.out.println ("Não foi possível realizar a comparação.");
		
		}
		
		input.close();
		

	}

}
