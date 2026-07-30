package aulas.srcAula1;

public class Professor {

    private String nomeProfessor ;

    
    public boolean resultado(Aluno aluno){
        if (aluno.media() >= 7){return true;}
        return false;
    }


    public String getNomeProfessor () {return this.nomeProfessor;}
    public void setrNomeProfessor (String novoValor) {this.nomeProfessor = novoValor;}

}
