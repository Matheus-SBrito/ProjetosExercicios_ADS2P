package aulas.POO.laboratorios.lab1.projetoDoacaoSangue;

public class Pessoa {
    
    private String nome;
    private String sexo;
    private float peso;
    private int altura; // em centimetros
    private int idade;

    public String getNome (){return this.nome;}
    public void setNome (String novoValor) {this.nome = novoValor;}


    public String getSexo (){return this.sexo;}
    public void setSexo (String novoValor) {this.sexo = novoValor;}


    public float getPeso (){return this.peso;}
    public void setPeso (float novoValor) {this.peso = novoValor;}


    public int getAltura (){return this.altura;}
    public void setAltura (int novoValor) {this.altura = novoValor;}


    public int getIdade (){return this.idade;}
    public void setIdade (int novoValor) {this.idade = novoValor;}


}
