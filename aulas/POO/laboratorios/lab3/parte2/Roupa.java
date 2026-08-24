package aulas.POO.laboratorios.lab3.parte2;

public class Roupa {
    
    private EstadoRoupa estado;
    private CorRoupa cor;
    private TamanhoRoupa tamanho;

    public EstadoRoupa getEstado () {return estado;}
    public void setEstado (EstadoRoupa novoValor) {estado = novoValor;}

    public CorRoupa getCor () {return cor;}
    public void setCor (CorRoupa novoValor) {cor = novoValor;}

    public TamanhoRoupa getTamanho () {return tamanho;}
    public void setTamanho (TamanhoRoupa novoValor) {tamanho = novoValor;}

}
