package aulas.POO.listas.semana4;

public class Retangulo{

    private int altura;
    private int base;

    public int getAltura (){return altura;}
    public void setAltura (int novoValor) {altura = novoValor;}

    public int getBase (){return base;}
    public void setBase (int novoValor){base = novoValor;}

    public int perimetro (){return base + altura;}
    public int area (){return base * altura;}

    public boolean isQuadrado () {return (base == altura);}

    public boolean equal (Retangulo obj){
        
        if (base == obj.base && altura == obj.altura)
            return true;

        else if (base == obj.altura && altura == obj.base)
            return true;

        else if (altura == obj.base && base == obj.altura)
            return true;

        return false;
    }


}