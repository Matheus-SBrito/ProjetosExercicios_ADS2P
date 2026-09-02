package aulas.POO.listas.semana6;

import java.util.Scanner;

public class q4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrada1:");
        String nome1 = input.nextLine(), nome2 = "";
        boolean igual = true;

        while (igual){
            System.out.println("Entrada2:");
            nome2 = input.nextLine();

            if (nome1.equals(nome2)){
                igual = true;
                System.out.println("As duas entradas devem ser diferentes");

            } else igual = false;

        }

        if (nome1.compareTo(nome2) <0) System.out.println(nome1 +", "+ nome2);
        else System.out.println(nome2 +", "+ nome1);

        input.close();
    }

}
