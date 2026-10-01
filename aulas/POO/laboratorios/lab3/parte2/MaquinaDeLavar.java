package aulas.POO.laboratorios.lab3.parte2;

public class MaquinaDeLavar {

    public int lavar (Roupa[] roupas){

        int tempoLavagem = 0;
        boolean existeBranco = false, existeColorido = false;

        for (Roupa roupaSerLavada: roupas){

            if (roupaSerLavada != null){

                if (roupaSerLavada.getCor() == CorRoupa.BRANCA){
                    existeBranco = true;}

                if (roupaSerLavada.getCor() == CorRoupa.COLORIDO){
                    existeColorido = true;}

                /* Finalização do código por mistura */
                    if (existeBranco && existeColorido) return -1;}
        }

        for (Roupa roupaSerLavada: roupas){
            
            /*Verificação de obj tipo roupa */
            if (roupaSerLavada != null){

                /* Acrescimo por cor */
                if (roupaSerLavada.getCor() == CorRoupa.BRANCA)
                    tempoLavagem += 1;

                if (roupaSerLavada.getCor() == CorRoupa.COLORIDO)
                    tempoLavagem += 2;

                /* Acrescimo por tamanho */
                if (roupaSerLavada.getTamanho() == TamanhoRoupa.P)
                    tempoLavagem += 3;

                else if (roupaSerLavada.getTamanho() == TamanhoRoupa.M)
                    tempoLavagem += 5;

                else if (roupaSerLavada.getTamanho() == TamanhoRoupa.G)
                    tempoLavagem += 8;

                /* Acrescimo por estado */
                /* Mudança de estado da roupa */
                if (roupaSerLavada.getEstado() == EstadoRoupa.SUJA){
                    tempoLavagem += 3;
                    roupaSerLavada.setEstado(EstadoRoupa.LIMPA);}
            }


                
        }

        return tempoLavagem;
    }
    
}
