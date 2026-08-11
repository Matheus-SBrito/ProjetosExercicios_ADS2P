package aulas.POO.laboratorios.lab2;
import java.util.Scanner;

public class Programa {
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        Ponto cartesiano1 = new Ponto();
        Ponto cartesiano2 = new Ponto();
        

        // Primeiro Ponto

        System.out.println(
            "Digite o valor do eixo horizontal (x):"
        );
            cartesiano1.setCordX(
                Integer.parseInt(input.nextLine())
            );
        

        System.out.println(
            "Digite o valor do eixo vertical (y):"
        );
            cartesiano1.setCordY(
                Integer.parseInt(input.nextLine())
            );

        
        System.out.println(cartesiano1.quadrante());


        // Segundo Ponto

        System.out.println(
            "Digite o valor do eixo horizontal (x):"
        );
            cartesiano2.setCordX(
                Integer.parseInt(input.nextLine())
            );
        

        System.out.println(
            "Digite o valor do eixo vertical (y):"
        );
            cartesiano2.setCordY(
                Integer.parseInt(input.nextLine())
            );

        
        System.out.println(cartesiano2.quadrante());


        // Verificação de igualdade entre os pontos
        System.out.println(
            "Há igualdade entre os pontos: " + 
            (
                (cartesiano1.eIgual(cartesiano2))?
                "Os dois pontos são iguais." :
                "Os dois pontos são diferentes."
            )
        );

        input.close();
    }

}
