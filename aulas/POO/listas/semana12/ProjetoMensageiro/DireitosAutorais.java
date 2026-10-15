package aulas.POO.listas.semana12.ProjetoMensageiro;

public class DireitosAutorais extends Decorador{
	
	public String getTexto() {
		Mensagem mensagem = super.getMensagem();
		
		if (mensagem != null) 
			return mensagem.getTexto().concat("\n[Direitos Reservados]");
		
		return null;
	}

}
