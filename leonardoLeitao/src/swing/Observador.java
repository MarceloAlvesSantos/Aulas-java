package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Para para a aplicao ao clicar no fechar(x)
		janela.setSize(600, 300);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // Para a janela aparecer no meio da tela
		
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!!");
		});
		
		janela.setVisible(true);
	}

}
