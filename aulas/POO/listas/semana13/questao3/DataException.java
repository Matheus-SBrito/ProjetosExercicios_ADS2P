package aulas.POO.listas.semana13.questao3;

public class DataException extends Exception {

	public DataException () {
		super("Valores invalídos, respeite faixa permitida para atribuição 'DD/MM/YYYY'.");}
	
	public DataException (String mensagem) {super(mensagem);}
	public DataException (String mensagem, Throwable causa) {super(mensagem, causa);}
}
