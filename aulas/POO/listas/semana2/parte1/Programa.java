package parte1;
import java.util.Scanner;

public class Programa{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ProdutoImportado produto1 = new ProdutoImportado();
        AgenteImportacao agente1 = new AgenteImportacao();

        System.out.println("Digite o tipo do produto:");
        produto1.setTipo(
            input.nextLine()
        );

        System.out.println("Digite o preço, em dolares, do produto:");
        produto1.setPreco(
            input.nextFloat()
        );

        System.out.println(
            "Custo final com o imposto incluso: " +
            agente1.calcularImposto(produto1)
        );

        input.close();
    }

}