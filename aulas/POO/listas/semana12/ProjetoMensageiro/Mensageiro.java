package aulas.POO.listas.semana12.ProjetoMensageiro;

public class Mensageiro {
	
	public Mensagem prepararMensagem (String assunto, Destinatario destino) {
		
		if (assunto.isBlank()) return null;
		
		Mensagem mensagem = new Mensagem ();
		mensagem.setTexto(assunto);
		switch (destino) {
		
		    case EXTERNO:
		        Criptografia criptografia = new Criptografia();
		        criptografia.setMensagem(mensagem);
		
		        String texto = criptografia.getTexto();
		        mensagem.setTexto(texto);
		
		        DireitosAutorais direitosAutorais = new DireitosAutorais();
		        direitosAutorais.setMensagem(mensagem);
		
		        texto = direitosAutorais.getTexto();
		        mensagem.setTexto(texto);
		        break;
		
		    case INTERNO:
		        break;
		
		    default:
		        return null;
		}

		
		
		return mensagem;
	}

}
