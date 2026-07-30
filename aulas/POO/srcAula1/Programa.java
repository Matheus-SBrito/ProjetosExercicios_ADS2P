package aulas.srcAula1;

public class Programa {

	public static void main(String[] args) {
	
	utilizandoAlunoProfessor();
		
	}


	public static void utilizandoAlunoProfessor (){
		Aluno aluno1 = new Aluno();

		aluno1.setNomeAluno("Irineu");
		
		aluno1.setNota1(10);
		aluno1.setNota2(8);
		aluno1.setNota3(5);
		

		System.out.println(aluno1.media());

		Professor professor1 = new Professor();
		professor1.setrNomeProfessor("Murilo");
		
		if (professor1.resultado(aluno1)){
			System.out.println("Aluno: " + aluno1.getNomeAluno() + "; Aprovado");
		} else {
			System.out.println("Aluno: " + aluno1.getNomeAluno() + "; Reprovado");
		}
		



	}

	public static void utilizandoCelular (){
		Celular c1 = new Celular();
		
		c1.setNumeroCelular( "(83) 9 9090-2828");
		
		c1.ligarCelular("(83) 9 9090-2121");
		c1.baterForte();
		
		
		Celular c2 = new Celular();
		
		c2.setNumeroCelular (
				"(83) 9 9292-2121");
		
		c2.ligarCelular("(83) 9 9090-2121");
		c2.baterForte();

	}

}
