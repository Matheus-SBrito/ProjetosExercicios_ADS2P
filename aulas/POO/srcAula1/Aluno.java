package aulas.POO.srcAula1;

public class Aluno {

    private String nomeAluno;
    private int nota1;
    private int nota2;
    private int nota3;


    
    public int media (){
        return (
            nota1 +
            nota2 +
            nota3
        ) / 3;
    }


    public String getNomeAluno () {return this.nomeAluno;}
    public void setNomeAluno (String novoValor) {this.nomeAluno = novoValor;}


    public int getNota1 () {return this.nota1;}
    public void setNota1 (int novoValor) {this.nota1 = novoValor;}


    public int getNota2 () {return this.nota2;}
    public void setNota2 (int novoValor) {this.nota2 = novoValor;}


    public int getNota3 () {return this.nota3;}
    public void setNota3 (int novoValor) {this.nota3 = novoValor;}



}
