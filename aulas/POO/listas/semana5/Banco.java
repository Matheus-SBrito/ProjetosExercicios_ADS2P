package aulas.POO.listas.semana5;

public class Banco {

    private ContaCorrente[] contasSalvas = new ContaCorrente[10];
    private int quantidadeContasSalvas = 0;

    public int getQuantidadeContasSalvas () {return quantidadeContasSalvas;}

    
    // Metodos Comportamentais
    public boolean salvarConta (ContaCorrente obj) {

        if (quantidadeContasSalvas >= 10) return false;

        for (ContaCorrente conta : contasSalvas){
            if (conta.eIgual(obj)) return false;
        }

        contasSalvas[
            quantidadeContasSalvas
        ] = obj;

        quantidadeContasSalvas ++;

        return true;

    }


    public ContaCorrente recuperarConta (String numeroConta) {

        for (ContaCorrente conta : contasSalvas) 
            if (conta.getNumero().equals(numeroConta)) return conta;

        return null;
    }

}
