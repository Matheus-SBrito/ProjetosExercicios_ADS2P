package aulas.POO.listas.semana6;

import java.util.Scanner;

public class q3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Número na base Hexadecimal: ");
        String hexaNumero = input.nextLine();
        hexaNumero = switch(hexaNumero.toUpperCase()){
            case "A" -> "10";
            case "B" -> "11";
            case "C" -> "12";
            case "D" -> "13";
            case "E" -> "14";
            case "F" -> "15";
            default -> hexaNumero;
        };

        
        System.out.println("Base Binária: " + Integer.toBinaryString(Integer.parseInt(hexaNumero)));
        System.out.println("Base Decimal: " + Integer.parseInt(""+hexaNumero, 16));
        input.close();
    }

}
