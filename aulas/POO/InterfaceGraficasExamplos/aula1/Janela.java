package aulas.POO.InterfaceGraficasExamplos.aula1;
import javax.swing.*;

public class Janela extends JFrame{
	
	
	
	public void desenhoPadrao () {
		this.setTitle("Minha Primeira Janela");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.botoesJanela();
		
		this.setVisible(true);
		
	}
	
	
	public void botoesJanela() {
		
		JButton botao1 = new JButton("Botão 1");
		botao1.setBounds(125, 30, 150, 40);
		
		JButton botao2 = new JButton("Botão 2");
		botao2.setBounds(125, 70, 150, 40);
		
		this.add(botao1);
		this.add(botao2);
		
	}
	
	
	
	public static void main (String[] args) {
		Janela j = new Janela();
		j.desenhoPadrao();
	}
	

}
