package aulas.POO.listas.semana5;

public class ContaCorrente {
    
    private float saldo;
    private String titular;
    private String numero;

    public float getSaldo () {return saldo;}
    public void setSaldo (float novoValor) {saldo = novoValor;}

    public String getTitular () {return titular;}
    public void setTitular (String novoValor) {titular = novoValor;}

    public String getNumero () {return numero;}
    public void setNumero (String novoValor) {numero = novoValor;}


    // Metodos de comportamento

    public boolean eIgual (ContaCorrente obj) {return numero.equals(obj.numero);}


}
