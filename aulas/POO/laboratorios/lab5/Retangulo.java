package aulas.POO.laboratorios.lab5;

public class Retangulo extends Forma{

    private int base, altura;


    // Construtor
    public  Retangulo (
        int base,
        int altura
    ){
        setAltura(altura);
        setBase(base);
    }

    // Metodos de Visibilidade
    public int getAltura() {return altura;}
    public void setAltura(int altura) {this.altura = altura;}

    public int getBase() {return base;}
    public void setBase(int base) {this.base = base;}


    // Metodos Herdados - Subrescrita
    public float calcularArea(){return base * altura;}
    public float calcularPerimetro(){return 2 * (base + altura); }


    
}
