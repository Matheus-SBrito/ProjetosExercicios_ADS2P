package aulas.POO.laboratorios.lab5;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos Objetos vc deseja cadastrar?");
        int qtdLoop = input.nextInt();
        Forma[] formas = new Forma[qtdLoop];

            for (int contador = 0; contador < qtdLoop; contador ++){

            System.out.println(
                "1-Retangulo\n"+
                "2-Circulo\n"+
                "3-Triangulo\n"+
                "Opções:"
            );

            Forma f = null;
            switch (input.nextLine()) {
                case "1":

                    int base, altura;

                    System.out.println("Digite a altura:");
                    altura = input.nextInt();

                    System.out.println("Digite a base:");
                    base = input.nextInt();

                    f = new Retangulo(base, altura);
                    break;
            
                default:
                    break;
            }}
    }

}
