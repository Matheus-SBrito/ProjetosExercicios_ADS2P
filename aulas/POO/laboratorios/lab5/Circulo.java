package aulas.POO.laboratorios.lab5;

public class Circulo extends Forma{

    private int raio;

    // Construtor
    public Circulo (
        int raio
    ){setRaio(raio);}


    // Metodos de Visibilidade
    public int getRaio() {return raio;}
    public void setRaio(int raio) {this.raio = raio;}


    // Metodos Herdados - Sobrescrita
    public float calcularArea (){
        return (float) Math.PI * (raio * raio);}

    public float calcularPerimetro(){
        return (float) (2 * Math.PI * raio);
    }

    
}
