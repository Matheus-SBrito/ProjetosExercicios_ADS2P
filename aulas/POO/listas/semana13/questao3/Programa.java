package aulas.POO.listas.semana13.questao3;
import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		int contadorErro = 0;
		int dia, mes, ano;
		
		while (true) {
			
			try {
				
				System.out.println("Digite o valor da 1º data (formato, 'DD/MM/YYYY'):");
				String[] dataTexto =  input.nextLine().split("/");
				
				dia = Integer.valueOf(dataTexto[0]);
				mes = Integer.valueOf(dataTexto[1]);
				ano = Integer.valueOf(dataTexto[2]);
				MinhaData data = new MinhaData (dia, mes, ano);
				
				break;
			}
			catch (Exception erro) {
				System.out.println(erro);
				contadorErro++;
			}
			
		}
		
		System.out.println("Quantidade de Erros: " + contadorErro);
		
		
	}

}
