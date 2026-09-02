package aulas.POO.listas.semana6.q5;
import java.util.Scanner;

public class Jogador {

    private String nome;
    private int quantidadePontos;

    public Jogador (String nome){
        this.nome = nome;}

    
    // Metodos de consulta
    public String getNome () {return nome;}
    public int getQuantidadePontos() {return quantidadePontos;}
    
    // Metodos Comportamentais
    public void adicionarPontos (){quantidadePontos ++;}


    // Função de Utilização e Execução do Programa
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        Jogador pessoa;
        Jogador maquina;
        Jogador vencedor;

        int soma, numMaquina = 0;

        System.out.println("Digite o seu nome de jogador: ");
        pessoa = new Jogador(
            input.nextLine()
        );

        System.out.println("Digite o nome da maquina: ");
        maquina = new Jogador(
            input.nextLine()
        );

        do{

            System.out.println("Digite um número qualquer:");
            numMaquina = (int) Math.round(Math.random() * 10);
            soma  =(Integer.parseInt(input.nextLine()) + numMaquina);

            System.out.println("Resultado da soma: " + soma);


            if (soma % 2 == 0) pessoa.adicionarPontos();
            else maquina.adicionarPontos();

            if (maquina.getQuantidadePontos() > pessoa.getQuantidadePontos())
                vencedor = maquina;
            else vencedor = pessoa;

        
        }while(vencedor.getQuantidadePontos() == 10);

        System.out.println("Jogador vencedor: " + vencedor.getNome());
        input.close();

    }
}
