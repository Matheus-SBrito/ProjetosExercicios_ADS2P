package aulas.POO.listas.semana6;


import java.util.Scanner;

public class q1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int maior = 0, menor = 0;
        boolean inicio = true;

        for (String numero: input.nextLine().split(",")){

            if (inicio){
                menor = Integer.parseInt(numero);
                maior = Integer.parseInt(numero);
                inicio = false;}

            menor = Math.min(menor, Integer.parseInt(numero));
            maior = Math.max(maior, Integer.parseInt(numero));
        
        }

        System.out.println("O maior número lido foi: " + maior);
        System.out.println("O menor número lido foi: " + menor);

        input.close();
    }

}
