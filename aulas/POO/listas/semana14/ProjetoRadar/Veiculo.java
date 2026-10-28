package aulas.POO.listas.semana14.ProjetoRadar;

public class Veiculo {
	
	private String placa;
	private float velocidadeAtual;
	private String nomeDoProprietario;
	
	// Construtor
	public Veiculo (float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	
	// Metodos de Visibilidade
	public String getPlaca() {return placa;}
	public void setPlaca(String placa) {this.placa = placa;}
	
	public float getVelocidadeAtual() {return velocidadeAtual;}
	public void setVelocidadeAtual(float velocidadeAtual) {this.velocidadeAtual = velocidadeAtual;}
	
	public String getNomeDoProprietario() {return nomeDoProprietario;}
	public void setNomeDoProprietario(String nomeDoProprietario) {this.nomeDoProprietario = nomeDoProprietario;}
	
	@Override
	public String toString () {
		return "Proprietario - " + 
				nomeDoProprietario + ", " + 
				placa + ":" + 
				velocidadeAtual;}
}
