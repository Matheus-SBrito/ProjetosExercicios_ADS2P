package aulas.POO.listas.semana14.ProjetoRadar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radar radar = new Radar(90f);
		Veiculo veiculo = null;
		int qtdMultas = 0;
		
		for (int contador = 0; contador < 100; contador ++)
			try {
				
				veiculo = new Veiculo((float) (40 + (Math.random() * 111) ));
				radar.verificarVelocidade(veiculo);
				
				System.out.println("\nVeiculo não multado:\n" + veiculo);
			
			} catch (VelocidadeMinimaNaoRespeitadaException | 
					VelocidadeMaximaNaoRespeitadaException e) {
				
				System.out.println(
						"\nVeiculo Multado:\n" + veiculo + 
						"\nMulta:" +  e.getMessage()
						);
				
				qtdMultas ++;
				
			}
		
		System.out.println("Quantidade de Multas: " + qtdMultas);
		
	}

}
