package questao4;

public class Planejador {
    
    public int abastecimento (Carro obj, float kmViagem){

        float autonomia = obj.getAutonomia();
        float capacidade = obj.getCapacidadeDoTanque();

        int litrosNecessarioViagem = (int) Math.ceil(
            kmViagem / (autonomia * capacidade)
        );

        return litrosNecessarioViagem;

    }

}