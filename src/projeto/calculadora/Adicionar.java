package projeto.calculadora;

import javax.swing.*;

public class Adicionar {
	public static void Valores(boolean primeiroCampo, JButton Btn, JTextField ValorUm, JTextField ValorDois) {
		String valor = Btn.getText();
		
		if(primeiroCampo) {
			ValorUm.setText(ValorUm.getText() + valor);
		}else {
			ValorDois.setText(ValorDois.getText()+ valor);
		}
	}
}