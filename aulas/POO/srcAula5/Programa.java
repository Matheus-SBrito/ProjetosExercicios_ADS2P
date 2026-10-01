package aulas.POO.srcAula5;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Scanner input;
        int num, cont, loop;

        for (
            input = new Scanner(System.in),
            System.out.println("Digite um número:"),
            num = Integer.parseInt(input.nextLine()),
            cont = 0,
            loop = 0;

            cont <= num;

            cont ++
        )

            if (cont % 2 != 0) System.out.println(++loop +"° Número Impar, de 0 a "+ num + ": " + cont);

    }

}
