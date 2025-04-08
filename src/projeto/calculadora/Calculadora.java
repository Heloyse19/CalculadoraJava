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
	private JTextField ValorUm;
	private JTextField ValorDois;
	private JTextField Resultado;

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
			ValorUm = new JTextField();
			ValorUm.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					primeiroCampo = true;
				}
			});
			ValorUm.setEditable(false);
			ValorUm.setBounds(97, 60, 134, 20);
			contentPanel.add(ValorUm);
			ValorUm.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Calculadora");
			lblNewLabel.setBounds(116, 11, 90, 22);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel);
		}
		
		ValorDois = new JTextField();
		ValorDois.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				primeiroCampo = false;
			}
		});
		ValorDois.setEditable(false);
		ValorDois.setBounds(97, 115, 134, 20);
		contentPanel.add(ValorDois);
		ValorDois.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 1");
		lblNewLabel_1.setBounds(97, 44, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 2");
		lblNewLabel_2.setBounds(97, 101, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		Resultado = new JTextField();
		Resultado.setBounds(97, 173, 134, 20);
		contentPanel.add(Resultado);
		Resultado.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(97, 158, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JButton SeteBtn = new JButton("7");
		SeteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar.Valores(true, SeteBtn, ValorUm, ValorDois);
			}
		});
		SeteBtn.setBounds(80, 237, 46, 23);
		contentPanel.add(SeteBtn);
		
		JButton OitoBtn = new JButton("8");
		OitoBtn.setBounds(128, 237, 46, 23);
		contentPanel.add(OitoBtn);
		
		JButton NoveBtn = new JButton("9");
		NoveBtn.setBounds(177, 237, 46, 23);
		contentPanel.add(NoveBtn);
		
		JButton DivisaoBtn = new JButton("/");
		DivisaoBtn.setBounds(235, 237, 55, 23);
		contentPanel.add(DivisaoBtn);
		
		JButton MultBtn = new JButton("*");
		MultBtn.setBounds(235, 271, 55, 23);
		contentPanel.add(MultBtn);
		
		JButton SeisBtn = new JButton("6");
		SeisBtn.setBounds(177, 271, 46, 23);
		contentPanel.add(SeisBtn);
		
		JButton CincoBtn = new JButton("5");
		CincoBtn.setBounds(128, 271, 46, 23);
		contentPanel.add(CincoBtn);
		
		JButton QuatroBtn = new JButton("4");
		QuatroBtn.setBounds(80, 271, 46, 23);
		contentPanel.add(QuatroBtn);
		
		JButton MaisBtn = new JButton("+");
		MaisBtn.setBounds(235, 308, 55, 23);
		contentPanel.add(MaisBtn);
		
		JButton TreisBtn = new JButton("3");
		TreisBtn.setBounds(177, 308, 46, 23);
		contentPanel.add(TreisBtn);
		
		JButton DoisBtn = new JButton("2");
		DoisBtn.setBounds(128, 308, 46, 23);
		contentPanel.add(DoisBtn);
		
		JButton UmBtn = new JButton("1");
		UmBtn.setBounds(80, 308, 46, 23);
		contentPanel.add(UmBtn);
		
		JButton MenosBtn = new JButton("-");
		MenosBtn.setBounds(235, 342, 55, 23);
		contentPanel.add(MenosBtn);
		
		JButton IgualBtn = new JButton("=");
		IgualBtn.setBounds(177, 342, 46, 23);
		contentPanel.add(IgualBtn);
		
		JButton ZeroBtn = new JButton("0");
		ZeroBtn.setBounds(128, 342, 46, 23);
		contentPanel.add(ZeroBtn);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(80, 342, 46, 23);
		contentPanel.add(btnC);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
