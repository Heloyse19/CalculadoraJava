package projeto.calculadora;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Calculadora extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField valorUm;
	private JTextField valorDois;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		try {
			Calculadora dialog = new Calculadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean primeiroCampo = true;
	private String metodoOpr;
	/**
	 * Create the dialog.
	 */
	public Calculadora() {
		setBounds(100, 100, 349, 517);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			valorUm = new JTextField();
			valorUm.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					primeiroCampo = true;
				}
			});
			valorUm.setEditable(false);
			valorUm.setBounds(97, 60, 134, 20);
			contentPanel.add(valorUm);
			valorUm.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Calculadora");
			lblNewLabel.setBounds(116, 11, 90, 22);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel);
		}
		
		valorDois = new JTextField();
		valorDois.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				primeiroCampo = false;
			}
		});
		valorDois.setEditable(false);
		valorDois.setBounds(97, 115, 134, 20);
		contentPanel.add(valorDois);
		valorDois.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 1");
		lblNewLabel_1.setBounds(97, 44, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 2");
		lblNewLabel_2.setBounds(97, 101, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel resultado = new JLabel("0");
		resultado.setBounds(97, 158, 75, 37);
		contentPanel.add(resultado);
		
		JButton seteBtn = new JButton("7");
		seteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, seteBtn, valorUm, valorDois);
			}
		});
		seteBtn.setBounds(80, 237, 46, 23);
		contentPanel.add(seteBtn);
		
		JButton oitoBtn = new JButton("8");
		oitoBtn.setBounds(128, 237, 46, 23);
		contentPanel.add(oitoBtn);
		oitoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, oitoBtn, valorUm, valorDois);
			}
		});
		
		
		JButton noveBtn = new JButton("9");
		noveBtn.setBounds(177, 237, 46, 23);
		contentPanel.add(noveBtn);
		noveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, noveBtn, valorUm, valorDois);
			}
		});
		
		JButton divisaoBtn = new JButton("/");
		divisaoBtn.setBounds(235, 237, 55, 23);
		contentPanel.add(divisaoBtn);
		divisaoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				metodoOpr = divisaoBtn.getText();
			}
		});
		
		
		JButton multBtn = new JButton("*");
		multBtn.setBounds(235, 271, 55, 23);
		contentPanel.add(multBtn);
		multBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodoOpr = multBtn.getText();
			}
		});
	
		JButton seisBtn = new JButton("6");
		seisBtn.setBounds(177, 271, 46, 23);
		contentPanel.add(seisBtn);
		seisBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, seisBtn, valorUm, valorDois);
			}
		});
		
		JButton cincoBtn = new JButton("5");
		cincoBtn.setBounds(128, 271, 46, 23);
		contentPanel.add(cincoBtn);
		cincoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, cincoBtn, valorUm, valorDois);
			}
		});
		
		JButton quatroBtn = new JButton("4");
		quatroBtn.setBounds(80, 271, 46, 23);
		contentPanel.add(quatroBtn);
		quatroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, quatroBtn, valorUm, valorDois);
			}
		});
		
		JButton maisBtn = new JButton("+");
		maisBtn.setBounds(235, 308, 55, 23);
		contentPanel.add(maisBtn);
		maisBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodoOpr = maisBtn.getText();
			}
		});
		
		JButton treisBtn = new JButton("3");
		treisBtn.setBounds(177, 308, 46, 23);
		contentPanel.add(treisBtn);
		treisBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, treisBtn, valorUm, valorDois);
			}
		});
		
		JButton doisBtn = new JButton("2");
		doisBtn.setBounds(128, 308, 46, 23);
		contentPanel.add(doisBtn);
		doisBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, doisBtn, valorUm, valorDois);
			}
		});
		
		JButton umBtn = new JButton("1");
		umBtn.setBounds(80, 308, 46, 23);
		contentPanel.add(umBtn);
		umBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, umBtn, valorUm, valorDois);
			}
		});
		
		JButton menosBtn = new JButton("-");
		menosBtn.setBounds(235, 342, 55, 23);
		contentPanel.add(menosBtn);
		menosBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodoOpr = menosBtn.getText();
			}
		});
		
		JButton igualBtn = new JButton("=");
		igualBtn.setBounds(177, 342, 46, 23);
		contentPanel.add(igualBtn);
		igualBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculandoValores.calcular(metodoOpr,valorUm, valorDois, resultado);
			}
		});
		
		JButton zeroBtn = new JButton("0");
		zeroBtn.setBounds(128, 342, 46, 23);
		contentPanel.add(zeroBtn);
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.valores(primeiroCampo, zeroBtn, valorUm, valorDois);
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.setBounds(80, 342, 46, 23);
		contentPanel.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorUm.setText("");
				valorDois.setText("");
				primeiroCampo = true;
				resultado.setText("0");
			}
		});
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
			}
		}
	}
}
