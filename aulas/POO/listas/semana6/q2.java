package aulas.POO.listas.semana6;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto = input.nextLine().toLowerCase();

        int vogais = 0, consoantes = 0;
        char caractere = ' ';

        String listaConsoantes = "bcdfghjklmnpqrstvxyz";
        for (
            int indice = 0;
            indice < texto.length();
            caractere = texto.charAt(indice),
            indice ++){

            if (Character.isLetter(caractere))
                if (listaConsoantes.indexOf(caractere) != -1) consoantes ++;
                else vogais++;
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);

        input.close();
    }
    
}
