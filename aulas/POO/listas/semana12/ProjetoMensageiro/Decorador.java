package aulas.POO.listas.semana12.ProjetoMensageiro;

public class Decorador {
	
	private Mensagem mensagem;

	
	// Metodos de Controle e Proteção
	public Mensagem getMensagem() {return mensagem;}
	public void setMensagem(Mensagem mensagem) {this.mensagem = mensagem;}
	
	public String getTexto () {return mensagem.getTexto();};
	

}
