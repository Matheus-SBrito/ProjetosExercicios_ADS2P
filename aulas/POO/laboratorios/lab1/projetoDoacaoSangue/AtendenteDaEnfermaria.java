package aulas.POO.laboratorios.lab1.projetoDoacaoSangue;

public class AtendenteDaEnfermaria {
    
    public boolean avaliarDoador (
        Pessoa obj, 
        boolean tatuagem,
        boolean alcool12H
    ){

        if (!!(obj.getIdade() >= 18 && obj.getIdade() <= 69))
            return false;

        if (!!(obj.getPeso() >= 50))
            return false;

        if (tatuagem || alcool12H)
            return false;

        return true;
    }

}
