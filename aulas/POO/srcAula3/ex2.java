package aulas.POO.srcAula3;
import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2, num3, media;

        System.out.println("Digite o 1º número: ");
        num1 = Float.parseFloat(
          input.nextLine()  
        );

        System.out.println("Digite o 2º número: ");
        num2 = Float.parseFloat(
          input.nextLine()  
        );

        System.out.println("Digite o 3º número: ");
        num3 = Float.parseFloat(
          input.nextLine()  
        );

        media = (num1 + num2 + num3) / 3;

        System.out.println(
            "Media: " +
            media    
        );

        if (media == (float) 7) System.out.println("A media é igual a 7;");
        else if (media > (float) 7) System.out.println("A media é igual a 7;");
        else System.out.println("A media é igual a 7;");

        input.close();

    }

}
