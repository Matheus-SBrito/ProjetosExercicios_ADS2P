package xadrez.classes.pecas;

public abstract class Peca {
    
    protected String nomePeca;

    // Metodos Abstratos
    public abstract void moverPeca();


    // Metodos - Atribuição
    public String getNomePeca () {return this.nomePeca;}
    public void setterNomePeca (String novoValor) {this.nomePeca = novoValor;}

}
