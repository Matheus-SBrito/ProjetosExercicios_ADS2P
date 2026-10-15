package aulas.POO.listas.semana12.ProjetoNovosUsados;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Modelo do carro: ");
        String modelo = leitor.nextLine().trim();
        
        System.out.print("Preço do carro (tabela FIPE): ");
        float preco = Float.parseFloat(leitor.nextLine().trim().replace(',', '.'));

		String tipo;
		 do {
	            System.out.print("Tipo do carro (novo ou usado): ");
	            tipo = leitor.nextLine().trim().toLowerCase();
	        } while (!tipo.equals("novo") && !tipo.equals("usado"));
		 
	        Carro carro;
	        if (tipo.equals("novo")) {
	            carro = new CarroNovo(modelo, preco);
	        } else {
	            carro = new CarroUsado(modelo, preco);
	        }
	    System.out.println(carro);
        System.out.println("Valor a ser pago: R$ "+ carro.getPreco());

        leitor.close();
	}
}
