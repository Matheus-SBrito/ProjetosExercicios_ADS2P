package aulas.POO.listas.semana12.ProjetoMensageiro;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		Mensageiro mensageiro = new Mensageiro();
		
		System.out.println("Digite o texto da mensagem:");
		String texto = input.nextLine();
		
		System.out.println("Digite o destinatário (Externo ou Interno): ");
		Destinatario destinatario = Destinatario.valueOf(input.nextLine().toUpperCase());
		
		Mensagem mensagem = mensageiro.prepararMensagem(texto, destinatario);
		
		System.out.println(mensagem.getTexto());
		
		input.close();
		
		
	}

}
