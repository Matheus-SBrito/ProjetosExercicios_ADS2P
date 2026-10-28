package aulas.POO.listas.semana14.ProjetoRadar;

public class Multa {
	
	private Veiculo veiculo;
	private float taxaMulta;
	
	// Construtor
	public Multa (Veiculo veiculo, float taxaMulta) {
		this.veiculo = veiculo;
		this.setTaxaMulta(taxaMulta);
	}
	
	
	// Metodos de Visibilidade
	public Veiculo getVeiculo() {return veiculo;}
	public void setVeiculo(Veiculo veiculo) {this.veiculo = veiculo;}


	public float getTaxaMulta() {return taxaMulta;}
	public void setTaxaMulta(float taxaMulta) {this.taxaMulta = taxaMulta;}
	
	

}
