package questao4;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Carro carro1 = new Carro();
        Planejador planejador1 = new Planejador();
        float distanciaPercorrida;

        System.out.println("Digite o modelo do carro: ");
        carro1.setModelo(
            input.nextLine()
        );

        System.out.println("Digite a autonomia do carro: ");
        carro1.setAutonomia(
            Float.parseFloat(
                input.nextLine()
            )
        );

        System.out.println("Digite a capacidade do tanque do carro: ");
        carro1.setCapacidadeDoTanque(
            Integer.parseInt(
                input.nextLine()
            )
        );

        System.out.println("Digite a distancia a ser percorrida em km: ");
        distanciaPercorrida = (
            Float.parseFloat(
                input.nextLine()
            )
        );

        System.out.println(
            "Será necessário '" +
            planejador1.abastecimento(
                carro1, 
                distanciaPercorrida
            ) +
            "' Abastecimentos, para a viagem."
        );

        input.close();
        

    }

}
