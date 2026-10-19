package aulas.POO.laboratorios.laboratorio8;

public abstract class Bebida {
	
	private String nome;
	private double preco;
	private float teorAlcolico;

	public Bebida() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public float getTeorAlcolico() {return teorAlcolico;}
	public void setTeorAlcolico(float teorAlcolico) {this.teorAlcolico = teorAlcolico;}

	public double getPreco() {return preco;}
	public void setPreco(double preco) {this.preco = preco;}

}
