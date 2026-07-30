package aulas.srcAula1;

public class Celular {
	
	private String numeroCelular;
	private Float pesoCelular;
	private boolean ligado;
	
	public void ligarCelular (String celularDestino) {
		
		System.out.println(
			"O celular:" + 
			this.numeroCelular + ";" +  
			"está ligando para: " + 
			celularDestino);
		
	}
	
	public boolean baterForte () {
		
		System.out.println("Foto tirada. Telefone: " + this.numeroCelular);
		return true;
	}
	
	
	
	// Metodos de Atribuição e Consulta da classe.
	
	public String getNumeroCelular () {return this.numeroCelular;}
	public void setNumeroCelular (String novoValor) {this.numeroCelular = novoValor;}
	
	
	public Float getPesoCelular () {return this.pesoCelular;}
	public void setPesoCelular (Float novoValor) {this.pesoCelular = novoValor;}
	
	
	public boolean getLigado () {return this.ligado;}
	public void setLigado (boolean novoValor) {this.ligado = novoValor;}
	
	

}
