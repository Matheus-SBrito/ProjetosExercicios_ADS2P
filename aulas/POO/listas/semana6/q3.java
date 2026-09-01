package aulas.POO.listas.semana6;

import java.util.Scanner;

public class q3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Número na base Hexadecimal: ");
        int hexaNumero = Integer.parseInt(input.nextLine());
        System.out.println("Base Binária: " + Integer.toBinaryString(hexaNumero));
        System.out.println("Base Decimal: " + Integer.parseInt(""+hexaNumero, 16));
        input.close();
    }

}
