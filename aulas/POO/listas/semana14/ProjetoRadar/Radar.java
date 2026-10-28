package aulas.POO.listas.semana14.ProjetoRadar;

public class Radar {

	private float velocidadeLimite;
	
	
	public Radar(float velocidadeLimite) {this.velocidadeLimite = velocidadeLimite;}

	
	// Metodos de Visibilidade
	public float getVelocidadeLimite() {return velocidadeLimite;}
	public void setVelocidadeLimite(float velocidadeLimite) {this.velocidadeLimite = velocidadeLimite;}
	
	
	// Metodos Comportamentais
	public void verificarVelocidade (Veiculo obj)
		throws VelocidadeMaximaNaoRespeitadaException,
				VelocidadeMinimaNaoRespeitadaException{
		
		float velocidadeMinima = velocidadeLimite / 2;
		Multa multa = null;
		
		
		if (obj.getVelocidadeAtual() < velocidadeMinima) {
			multa = new Multa(obj, 87.33f);
			throw new VelocidadeMinimaNaoRespeitadaException(velocidadeMinima, multa);}
		
		
		if (obj.getVelocidadeAtual() > velocidadeLimite) {
			
			if (obj.getVelocidadeAtual() <= limitePorCentagem(velocidadeLimite, 20f))
				multa = new Multa (obj, 85.13f);
			
			else if (obj.getVelocidadeAtual() <= limitePorCentagem(velocidadeLimite, 50f))
				multa = new Multa (obj, 127.53f);
			
			else multa = new Multa (obj, 574.62f);
			
			throw new VelocidadeMaximaNaoRespeitadaException(velocidadeLimite, multa);
		}
			
		
	}
	
	
	// Metodo de Acrescimo de Porcentagem
	public static float limitePorCentagem(float limite,float porcentagemAcrescimo) {
        return limite * (1 + (porcentagemAcrescimo / 100));
    }
	
	
}
