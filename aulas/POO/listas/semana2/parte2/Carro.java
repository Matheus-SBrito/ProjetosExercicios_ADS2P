package parte2;

public class Carro {
    /* 
    °A autonomia de um carro consiste na quantidade de quilômetros que o carro consegue percorrer com um 1 litro de combustíve
    */

    private String modelo;
    private float autonomia;
    private int capacidadeDoTanque;


    // Classes de controle consulta e atribuição a atributos
    public String getModelo (){return this.modelo;}
    public void setModelo (String novoValor){this.modelo = novoValor;}

    public float getAutonomia (){return this.autonomia;}
    public void setAutonomia (float novoValor){this.autonomia = novoValor;}

    public int getCapacidadeDoTanque (){return this.capacidadeDoTanque;}
    public void setCapacidadeDoTanque (int novoValor) {this.capacidadeDoTanque = novoValor;}

}