package aulas.POO.srcAula4;
import java.util.Scanner;


public class Programa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int repeticao = 0;

        System.out.println("Escreva seu nome de usuário: ");
        String nomeUsuario = input.nextLine();

        System.out.println("Digite a quantidade de vezes que quer que ele imprima: ");
        int vezesRepet = Integer.parseInt(
            input.nextLine()
        );

        while (
            repeticao <
            vezesRepet
        ) System.out.println(
            "Usuário:" + 
            nomeUsuario + 
            " | Número da Repetição: " + 
            ++repeticao );

        input.close();
    }
    
}
