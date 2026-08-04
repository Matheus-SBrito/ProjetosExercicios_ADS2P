package aulas.POO.laboratorios.lab1.projetoDoacaoSangue;

import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AtendenteDaEnfermaria enfermeira1 = new AtendenteDaEnfermaria();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Pessoa 1 - Digite seu nome: ");
        pessoa1.setNome(
            input.nextLine()
        );

        System.out.println("Pessoa 1 - Digite seu sexo: ");
        pessoa1.setSexo(
            input.nextLine()
        );

        System.out.println("Pessoa 1 - Digite seu Idade: ");
        pessoa1.setIdade(
            Integer.parseInt(
                input.nextLine()
            )
        );

        System.out.println("Pessoa 1 - Digite seu peso: ");
        pessoa1.setPeso(
            Float.parseFloat(
                input.nextLine()
            )
        );

        System.out.println("Pessoa 1 - Digite seu altura: ");
        pessoa1.setAltura(
            Integer.parseInt(
                input.nextLine()
            )
        );

        enfermeira1.avaliarDoador(
            pessoa2,
            false, 
            false);
    }

}
