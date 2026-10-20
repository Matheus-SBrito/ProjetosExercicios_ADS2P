package aulas.POO.laboratorios.laboratorio8;

public class Adicional extends Bebida{
	private Bebida bebida;
	
	public Adicional(Bebida bebida) {
		this.bebida=bebida;
	}
	
	public String getNome() {
		
		return getNome() +", "+ bebida.getNome();}
	public double getPreco() {return getPreco() + bebida.getPreco();}
	public float getTeorAlcolico() {return getTeorAlcolico()+bebida.getTeorAlcolico();}

}
