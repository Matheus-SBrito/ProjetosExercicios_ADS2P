import java.util.Scanner;

public class q1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int numero1 = Integer.parseInt(input.nextLine());
        int numero2 = Integer.parseInt(input.nextLine());
        int maior = Math.max(numero1, numero2), menor = Math.min(numero1, numero2);
        int potencia;

        System.out.println("Potência: " + (potencia = (int) Math.pow(maior, menor)));
        System.out.println("Raiz Quadrada: " + (int) Math.ceil(Math.sqrt(potencia)) );

    }

}
