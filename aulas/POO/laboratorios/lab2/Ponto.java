package aulas.POO.laboratorios.lab2;

public class Ponto {
    
    private int cordX;
    private int cordY;


    // Metodos de Comportamento

    public String quadrante (){

        if (cordX == 0 && cordY == 0) return "origem";
        else if (cordX > 0 && cordY > 0) return "1° Quadrante";
        else if (cordX < 0 && cordY > 0) return "2° Quadrante";
        else if (cordX < 0 && cordY < 0) return "3° Quadrante";
        else if (cordX > 0 && cordY < 0) return "4° Quadrante";
        else if (cordX == 0) return "Posicação " + cordY + " No eixo Vertical.";

        return "Posicação " + cordX + " No eixo Horizontal.";

    }

    public boolean eIgual (Ponto obj) {

        return (cordX == obj.getCordX() && cordY == obj.getCordY());
    }

    // Metodos de Proteção

    public int getCordX (){return cordX;}
    public void setCordX (int novoValor) {cordX = novoValor;}

    public int getCordY (){return cordY;}
    public void setCordY (int novoValor) {cordY = novoValor;}

}
