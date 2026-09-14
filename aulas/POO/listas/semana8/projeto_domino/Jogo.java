package aulas.POO.listas.semana8.projeto_domino;

import java.util.Arrays;
import java.util.Scanner;

public class Jogo {
    
    private Domino arrayPecas[] = new Domino[28];
    private int indicePecaPuxada = 0;


    // Execução do Programa
    public static void main(String[] args) {
        /* Necessidades do Jogo:
        *
        * Peça da vez
        * Mão do jogador
        * Substituição -
        * 
        *   Peça da vez <-> Peça do jogador.
        *   # Consequentemente a esta ação,
        *   a mão do jogador perde a peça.
        * 
        * Vitoria => Peças do jogador = 0
        */


        // Jogo Unominó
        Jogo unomino = new Jogo();
        unomino.embaralharPecas();

        // Quantidade de peças iniciais do jogador
        int qtdMao = 6;

        Scanner input = new Scanner(System.in);

        
        Domino[] maoJogador = new Domino[6];
        for (int cont = 0; cont < qtdMao; cont++)
            maoJogador[cont] = unomino.pecaPuxada();

        /*
        * -1 - Derrota
        *  0 - Continuar Jogo
        *  1 - Vitoria
        */
        int fimDoJogo = 0, pontos = 0; 
        Domino pecaDaVez = unomino.pecaPuxada();
        

        while (fimDoJogo == 0) {

            System.out.println(
                "Peça da vez: " + 
                pecaDaVez.toString()
            );

            System.out.println(
                "Peças na Mão: " + 
                Arrays.toString(maoJogador)
            );

            System.out.println(
                "Indique o indice da peça que deseja casar (0-5): "
            );

            int indiceMao = Integer.valueOf(input.nextLine());
            if (pecaDaVez.validarJuncao(
                maoJogador[indiceMao])){

                    pontos ++;
                    pecaDaVez = maoJogador[indiceMao];
                    maoJogador[indiceMao] = null;

            } else fimDoJogo = -1;

            if (pontos == qtdMao)
                fimDoJogo = 1;
            
        }

        System.out.println(
            "Voncê " + 
            ((fimDoJogo == 1)?
            "Ganhou " : "Perdeu ") +
            "O jogo."
        );

        System.out.println("Total de pontos: " + pontos);
        input.close();
        
    }

    
    // Construtor da classe
    public Jogo (){

        for (
            int posicao = 0,
            contA = 0, 
            contB = 0,
            anterior = contA;

            posicao <= 27;

            posicao ++,
            contA += (contB == 6)?
                1 : 0,
            contB = (anterior == contA)?
                contB + 1 : contA,

            anterior = contA
        )
        
            arrayPecas[posicao] = new Domino(contA, contB);

    }


    // Metodos Comportamentais
    public void embaralharPecas () {
        
        indicePecaPuxada = 0;
        int indiceSorteadoA, indiceSorteadoB;
        Domino pecaA, pecaB;

        for (int loop = 0; loop <100; loop++){

        // Sorteio dos indices das peças trocadas
        indiceSorteadoA = (int) Math.round(Math.random() * 27);
        indiceSorteadoB = (int) Math.round(Math.random() * 27);

        // Recolhimento das peças trocadas
        pecaA = arrayPecas[indiceSorteadoA];
        pecaB = arrayPecas[indiceSorteadoB];

        // Troca de Peças
        arrayPecas[indiceSorteadoB] = pecaA;
        arrayPecas[indiceSorteadoA] = pecaB;
        }

        System.out.println(Arrays.toString(arrayPecas));
    }


    public Domino pecaPuxada () {
        if (indicePecaPuxada <=27){
            return arrayPecas[indicePecaPuxada++];
        }

        return null;
    }

}