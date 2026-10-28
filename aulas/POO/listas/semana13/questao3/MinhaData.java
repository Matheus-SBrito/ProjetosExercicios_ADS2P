package aulas.POO.listas.semana13.questao3;

public class MinhaData implements ClasseComparavel {
	
	private int dia, mes, ano;
	
	public MinhaData (
		int dia,
		int mes,
		int ano
		) throws DataException  {
		
		if (
			(dia < 1 || dia > 31) || 
			(mes < 1 || mes > 12) || 
			 ano < 0)
			throw new DataException();
		
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	
	public int getDia() {return dia;}
	public void setDia(int dia) {this.dia = dia;}
	
	public int getMes() {return mes;}
	public void setMes(int mes) {this.mes = mes;}
	
	public int getAno() {return ano;}
	public void setAno(int ano) {this.ano = ano;}
	
	@Override
	public String toString () {return dia + "/" + mes + "/"+ ano;}
	
	@Override
	public int comparacao(Object obj) {
		// TODO Auto-generated method stub
		
		if (obj instanceof MinhaData) {
			MinhaData data = (MinhaData) obj;
			
			if (
				ano == data.getAno() &&
				mes == data.getMes() &&
				dia == data.getDia()
				) return 0;
			else if (
				ano == data.getAno() &&
				mes == data.getMes()
				) 
				if (dia > data.getDia()) return 1;
				else return 2;
			else if (
				ano == data.getAno()	
				)
				if (mes > data.getMes()) return 1;
				else return 2;
			else 
				if (ano > data.getAno()) return 1;
				else return 2;
		}
		return -1;
	}
}
