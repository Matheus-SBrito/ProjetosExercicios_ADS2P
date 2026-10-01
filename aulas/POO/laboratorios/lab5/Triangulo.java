package aulas.POO.laboratorios.lab5;

public class Triangulo extends Forma{

    private int lado1, lado2, lado3;

    // Metodo Construtor
    public Triangulo (
        int lado1,
        int lado2,
        int lado3
    ){
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }


    // Metodos de Visibilidade
    public int getLado1() {return lado1;}
    public void setLado1(int lado1) {this.lado1 = lado1;}

    public int getLado2() {return lado2;}
    public void setLado2(int lado2) {this.lado2 = lado2;}

    public int getLado3() {return lado3;}
    public void setLado3(int lado3) {this.lado3 = lado3;}


    // Metodos Herdados - Sobrescrita
    public float calcularPerimetro(){return lado1 + lado2 + lado3;}

    public float calcularArea(){
        float p = calcularPerimetro() / 2;
        return (float)(Math.sqrt(
           p*
           (p-lado1)*
           (p-lado2)*
           (p-lado3)
            )
        );
    }

    
}
