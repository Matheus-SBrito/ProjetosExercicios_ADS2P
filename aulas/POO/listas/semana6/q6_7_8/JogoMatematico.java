package aulas.POO.listas.semana6.q6_7_8;

import java.util.Scanner;

public class JogoMatematico {
    
    private String calculo;
    private int resposta;

    // Metodos de Controle de Acessos.
    public String getCalculo () {return calculo;}
    public int getResposta () {return resposta;}


    // Metodos Comportamentais.
    public void sortearCalculo () {
        /**
        * Sortear dois numeros de 0 a 100
        * Sortear um tipo de calculo
        * Apresentar a operação
        * Armazenar o calculo
        * Armazenar a resposta
        **/

        int n1, n2, escolhaAleatoria;

        n1 = (int) Math.round(Math.random() * 100);
        n2 = (int) Math.round(Math.random() * 100);

        escolhaAleatoria = (int) Math.round(Math.random() * 3);
        switch (escolhaAleatoria) {
            case 0:
                calculo = "+";
                resposta = n1 + n2;
                break;
        
            case 1:
                calculo = "-";
                resposta = n1 - n2;
                break;

            case 2:
                calculo = "x";
                resposta = n1 * n2;
                break;

            default:
                calculo = "/";
                resposta = n1 /n2;
        }

        System.out.println(
            "\nCalculo Proposto: \n" +
            n1 + " " + calculo + " " + n2 
        );

    }

    public boolean checarResposta (int valor) {
        return valor == resposta;
    }


    // Metodo de Execução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JogoMatematico jogo = new JogoMatematico();
        boolean acertou;
        int qtdAcertos = 0;

        for (
            int qtdFalhas = 0;
            qtdFalhas != 3;
            qtdAcertos += (acertou)? 1:0,
            qtdFalhas += (!acertou)? 1:0
        ){

            jogo.sortearCalculo();

            System.out.println("Informe o resultado de sua solução:");
            
            acertou = jogo.checarResposta(
                Integer.parseInt(
                    input.nextLine()
                )
            );

        }

        System.out.println("Quantidade de acertos: " + qtdAcertos);
        input.close();
    }
    
}
