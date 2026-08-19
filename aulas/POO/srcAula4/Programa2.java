package aulas.POO.srcAula4;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int soma = 0;
        
        do {
            num = Integer.parseInt(input.nextLine())
            soma+=num;
        }while (num != -1);
        System.out.println(num);
        input.close();

            
        
    }
}
