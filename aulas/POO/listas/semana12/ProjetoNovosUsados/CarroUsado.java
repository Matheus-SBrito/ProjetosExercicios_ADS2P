package aulas.POO.listas.semana12.ProjetoNovosUsados;

public class CarroUsado extends Carro {
	private float percentualDesconto;
	
	public CarroUsado(String modelo,float preco) {
		super(modelo,preco);
		percentualDesconto=0.9f;
	}
	public float getPercetualDesconto() {
		return percentualDesconto;
	}
	

	public float getPreco() {
		float fipe = super.getPreco();
		return fipe * percentualDesconto;
	}
	public String toString() {
		return "Carro usado, "+ super.getModelo()+", R$"+super.getPreco();
	}

}
