package aulas.POO.listas.semana12.ProjetoNovosUsados;

public abstract class Carro {
private String modelo;
private float preco;


public Carro(String modelo,float preco) {
	this.modelo=modelo;
	this.preco=preco;
}

public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public float getPreco() {
	return preco;
}

}
