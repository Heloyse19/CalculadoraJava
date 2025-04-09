package projeto.calculadora;

import javax.swing.*;

public class CalculandoValores {
	public static void calcular(String metodoOpr, JTextField valorUm, JTextField valorDois, JLabel resultado) {
		try {
			int vInt = Integer.parseInt(valorUm.getText());
			int vInt2 = Integer.parseInt(valorDois.getText());
			
			switch (metodoOpr) {
			case "/":
				if (vInt2 == 0) {
					JOptionPane.showMessageDialog(null, "Não pode divisão por zero", "ERRO", JOptionPane.ERROR_MESSAGE);
					break;
				}
				double valor1Double = (double) vInt;
				double valor2Double = (double) vInt2;
				resultado.setText(String.format("%.2f", valor1Double / valor2Double));
				break;
				
			case "+":
				resultado.setText(String.format("%d", vInt + vInt2));
				break;
				
			case "-":
				resultado.setText(String.format("%d", vInt - vInt2));
				break;
				
			case "*":
				resultado.setText(String.format("%d", vInt * vInt2));
				break;
				
			default:
				break;
			}

		}
		catch (NumberFormatException e) {
			if (valorUm.getText().isBlank() && valorUm.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			else if (valorDois.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Insira o valor 2", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			else if(valorUm.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Insira o valor 1", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
