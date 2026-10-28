package aulas.POO.listas.semana14.ProjetoRadar;

public class VelocidadeMaximaNaoRespeitadaException 
	extends Exception{
	
	public VelocidadeMaximaNaoRespeitadaException() {super("Velocidade Maximima não respeitada.");}
	public VelocidadeMaximaNaoRespeitadaException(float limiteDeVelocidadeMaxima) {super("O limite de velocidade máxima, " + limiteDeVelocidadeMaxima + " Km/h, foi ultrapassado.");}
	public VelocidadeMaximaNaoRespeitadaException(float limiteDeVelocidadeMaxima, Multa multa) {
		super("\nLimite de velocidade ultrapassado, " + limiteDeVelocidadeMaxima + " Km/h." + "Taxa da Multa: " + multa.getTaxaMulta());
	}

}
