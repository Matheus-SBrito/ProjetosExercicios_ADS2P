package aulas.POO.InterfaceGraficasExamplos.aula1;
import javax.swing.JFrame;

import java.awt.Dimension;

import javax.swing.JButton;

public class ExemploJanelas {
	
	
	public static void main (String[] args) {
		
		// Criação da Janela/Window
		JFrame janela = new JFrame ("Minha primeira Janela");
		
		
		// Configuração dos elementos básicos da Interface grafica
		janela.setSize(500, 500); // Tamanho da Janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Operação de Finalização do Programa ao Fechar o Window
		janela.setLocationRelativeTo(null); // Posição de inicialozação da janela
		
		
		// Acrescimo de elementos na janela
		JButton botao = new JButton("Botão de teste");
		botao.setPreferredSize(new Dimension(100,100));
		janela.add(botao);
		
		JButton botao2 = new JButton("Botão de teste2");
		botao2.setPreferredSize(new Dimension(100,100));
		janela.add(botao2);
		
		
		
		janela.setVisible(true); // Carregando o component e deixando o vísivel
	}
	
}
