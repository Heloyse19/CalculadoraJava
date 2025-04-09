package projeto.calculadora;

import javax.swing.*;

public class Adicionar {
	public static void valores(boolean primeiroCampo, JButton Btn, JTextField valorUm, JTextField valorDois) {
		String valor = Btn.getText();
		
		if(primeiroCampo) {
			valorUm.setText(valorUm.getText() + valor);
		}else {
			valorDois.setText(valorDois.getText()+ valor);
		}
	}
}