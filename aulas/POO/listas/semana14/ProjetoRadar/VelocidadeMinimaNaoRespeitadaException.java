package aulas.POO.listas.semana14.ProjetoRadar;

public class VelocidadeMinimaNaoRespeitadaException 
	extends Exception{
	
	public VelocidadeMinimaNaoRespeitadaException() {super("Velocidade Mínima não respeitada.");}
	public VelocidadeMinimaNaoRespeitadaException(float limiteDeVelocidadeMinima) {super("A velocidade do veiculo está abaixo do mínimo, " + limiteDeVelocidadeMinima);}
	public VelocidadeMinimaNaoRespeitadaException(float limiteDeVelocidadeMinima, Multa multa) {
		super("\nLimite de velocidade minima não alcançado, " + limiteDeVelocidadeMinima + " Km/h." + "Taxa da Multa: \n" + multa.getTaxaMulta());
	}
}
