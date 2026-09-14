package aulas.POO.listas.semana8.projeto_domino;

public class Domino {
    
    private int ladoA;
    private int ladoB;

    // Metodos de Controle de Consulta e  Registro
    public int getLadoA() {return ladoA;}
    public void setLadoA (int novoValor){

        if (novoValor >= 0 && novoValor <= 6)
            ladoA = novoValor;
    
    }

    public int getLadoB() {return ladoB;}
    public void setLadoB (int novoValor){

        if (novoValor >= 0 && novoValor <= 6)
            ladoB = novoValor;
    
    }


    // Construtor da Classe.
    public Domino(
        int ladoA,
        int ladoB
    ){
        setLadoA(ladoA);
        setLadoB(ladoB);
    }


    // Metodos Comportamentais
    public boolean validarJuncao (Domino obj){

        if (ladoA == obj.ladoA || ladoA == obj.ladoB)
            return true;
        else if (ladoB == obj.ladoA || ladoB == obj.ladoB)
            return true;
        
        return  false;
    }


    public String toString (){
        return "[" + ladoA + ", " + ladoB + "]";}


    public boolean equals (Domino obj){
        Domino inverso = new Domino (
            obj.ladoB,
            obj.ladoA
        );

        if (
            toString().equals(obj.toString()) &&
            toString().equals(inverso.toString())
        ) return true;

        return false;
    }


}
