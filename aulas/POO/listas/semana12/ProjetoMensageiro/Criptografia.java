package aulas.POO.listas.semana12.ProjetoMensageiro;

public class Criptografia extends Decorador{
	
	public String getTexto() {
		Mensagem mensagem = super.getMensagem();

		if (mensagem != null) 
			return mensagem.getTexto().replace(" ", "*");
		
		return null;
	}

}
