package BTC_Reus2022_UD21_Equipo.BTC_Reus2022_UD21_Equipo;

/**
 * @author Josep Oriol López Bosch 
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 * 
 * @version 0.0.1
 * @date 09/05/2022
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

/**
 * Este programa realizará las diferentes conversiones de divisas, mediante dos
 * comboBox se eligirá el tipo de moneda a convertir.
 */
public class Vista implements ActionListener{
	
	public Funciones func;

	// Atributos de clase.
	private JFrame frmConversorDeDivisas;
	public JTextField moneda_arriba;
	public JTextField moneda_abajo;
	private JTextField txtMoneda;
	private JButton btn_num9;
	private JButton btn_num8;
	private JButton btn_num7;
	private JButton btn_num6;
	private JButton btn_num5;
	private JButton btn_num4;
	private JButton btn_num3;
	private	JButton btn_num2;
	private JButton btn_num1;
	private JButton btn_num0;
	private JButton btn_ce;
	private JButton btn_borrarNumero;
	private JButton btn_coma;
	private JComboBox comboBox_superior;
	private JComboBox comboBox_inferior;
	private String valorNumero ="";
	public String resultado="";
	
	

	// Se crea una instancia de la vista y se otorga visibilidad en el JFrame.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frmConversorDeDivisas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Llama al método que ejecuta la vista.
	public Vista() {
		initialize();
	}

	/**
	 * Se inicializa la vista, se cargan los componentes, se define su forma y se
	 * define su posición en el JFrame.
	 */
	private void initialize() {
		//Creacion de objetos
		func = new Funciones();
		frmConversorDeDivisas = new JFrame();
		btn_num9 			= new JButton("9");
		btn_num8 			= new JButton("8");
		btn_num7 			= new JButton("7");
		btn_num6 			= new JButton("6");
		btn_num5			= new JButton("5");
		btn_num4 			= new JButton("4");
		btn_num3 			= new JButton("3");
		btn_num2 			= new JButton("2");
		btn_num1 			= new JButton("1");
		btn_num0 			= new JButton("0");
		btn_ce 				= new JButton("CE");
		btn_borrarNumero 	= new JButton("del");
		btn_coma 			= new JButton(",");
		comboBox_superior 	= new JComboBox();
		comboBox_inferior 	= new JComboBox();
	
		
		// Se crea una instancia de la clase JFrame y se definen sus atributos.
		frmConversorDeDivisas.setTitle("Conversor de divisas");
		frmConversorDeDivisas.getContentPane().setBackground(Color.DARK_GRAY);
		frmConversorDeDivisas.setBackground(UIManager.getColor("Button.darkShadow"));
		frmConversorDeDivisas.setBounds(100, 100, 663, 585);
		frmConversorDeDivisas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeDivisas.getContentPane().setLayout(null);

		// Se crea componente botón y se asignan atributos.
		
		btn_num9.setBorder(null);
		btn_num9.setForeground(Color.BLACK);
		btn_num9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num9.setBackground(Color.LIGHT_GRAY);
		btn_num9.setBounds(518, 171, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num9);

		// Se crea componente botón y se asignan atributos.
		
		btn_num8.setBorder(null);
		btn_num8.setForeground(Color.BLACK);
		btn_num8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num8.setBackground(Color.LIGHT_GRAY);
		btn_num8.setBounds(408, 171, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num8);

		// Se crea componente botón y se asignan atributos.
		
		btn_num7.setBorder(null);
		btn_num7.setForeground(Color.BLACK);
		btn_num7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num7.setBackground(Color.LIGHT_GRAY);
		btn_num7.setBounds(298, 171, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num7);

		// Se crea componente botón y se asignan atributos.
		
		btn_num6.setBorder(null);
		btn_num6.setForeground(Color.BLACK);
		btn_num6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num6.setBackground(Color.LIGHT_GRAY);
		btn_num6.setBounds(518, 257, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num6);

		// Se crea componente botón y se asignan atributos.
		
		btn_num5.setBorder(null);
		btn_num5.setForeground(Color.BLACK);
		btn_num5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num5.setBackground(Color.LIGHT_GRAY);
		btn_num5.setBounds(408, 257, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num5);

		// Se crea componente botón y se asignan atributos.
		
		btn_num4.setBorder(null);
		btn_num4.setForeground(Color.BLACK);
		btn_num4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num4.setBackground(Color.LIGHT_GRAY);
		btn_num4.setBounds(298, 257, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num4);

		// Se crea componente botón y se asignan atributos.
		
		btn_num3.setBorder(null);
		btn_num3.setForeground(Color.BLACK);
		btn_num3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num3.setBackground(Color.LIGHT_GRAY);
		btn_num3.setBounds(518, 343, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num3);

		// Se crea componente botón y se asignan atributos.
		
		btn_num2.setBorder(null);
		btn_num2.setForeground(Color.BLACK);
		btn_num2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num2.setBackground(Color.LIGHT_GRAY);
		btn_num2.setBounds(408, 343, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num2);

		// Se crea componente botón y se asignan atributos.
		
		btn_num1.setBorder(null);
		btn_num1.setForeground(Color.BLACK);
		btn_num1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num1.setBackground(Color.LIGHT_GRAY);
		btn_num1.setBounds(298, 343, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num1);

		// Se crea componente botón y se asignan atributos.
		
		btn_num0.setBorder(null);
		btn_num0.setForeground(Color.BLACK);
		btn_num0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_num0.setBackground(Color.LIGHT_GRAY);
		btn_num0.setBounds(408, 430, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_num0);

		// Se crea componente botón y se asignan atributos.
		
		btn_ce.setBorder(null);
		btn_ce.setForeground(Color.WHITE);
		btn_ce.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_ce.setBackground(Color.GRAY);
		btn_ce.setBounds(408, 78, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_ce);

		// Se crea componente botón y se asignan atributos.
		
		btn_borrarNumero.setBorder(null);
		btn_borrarNumero.setForeground(Color.WHITE);
		btn_borrarNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_borrarNumero.setBackground(Color.GRAY);
		btn_borrarNumero.setBounds(518, 78, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_borrarNumero);

		// Se crea componente botón y se asignan atributos.
		
		btn_coma.setBorder(null);
		btn_coma.setForeground(Color.BLACK);
		btn_coma.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_coma.setBackground(Color.LIGHT_GRAY);
		btn_coma.setBounds(518, 429, 100, 75);
		frmConversorDeDivisas.getContentPane().add(btn_coma);

		// Se crea el campo de texto y asigan atributos.
		moneda_arriba = new JTextField();
		moneda_arriba.setForeground(Color.WHITE);
		moneda_arriba.setBorder(null);
		moneda_arriba.setEditable(false);
		moneda_arriba.setBackground(Color.DARK_GRAY);
		moneda_arriba.setBounds(20, 173, 226, 73);
		frmConversorDeDivisas.getContentPane().add(moneda_arriba);
		moneda_arriba.setColumns(10);

		// Se crea el campo de texto y asigan atributos.
		moneda_abajo = new JTextField();
		moneda_abajo.setForeground(Color.WHITE);
		moneda_abajo.setBorder(null);
		moneda_abajo.setEditable(false);
		moneda_abajo.setColumns(10);
		moneda_abajo.setBackground(Color.DARK_GRAY);
		moneda_abajo.setBounds(20, 345, 226, 73);
		frmConversorDeDivisas.getContentPane().add(moneda_abajo);

		// Se crea el campo de texto y asigan atributos.
		txtMoneda = new JTextField();
		txtMoneda.setForeground(Color.WHITE);
		txtMoneda.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMoneda.setText("Moneda");
		txtMoneda.setEditable(false);
		txtMoneda.setColumns(10);
		txtMoneda.setBorder(null);
		txtMoneda.setBackground(Color.DARK_GRAY);
		txtMoneda.setBounds(20, 11, 162, 73);
		frmConversorDeDivisas.getContentPane().add(txtMoneda);

		// Se crea el comboBox, se definen sus atributos y valores.
		
		comboBox_superior.setBorder(null);
		comboBox_superior.setModel(new DefaultComboBoxModel(new String[] { "Dolar", "Euro", "Rubla" }));
		comboBox_superior.setSelectedIndex(0);
		
		comboBox_superior.setBackground(Color.DARK_GRAY);
		comboBox_superior.setForeground(Color.WHITE);
		comboBox_superior.setBounds(20, 257, 226, 22);
		frmConversorDeDivisas.getContentPane().add(comboBox_superior);

		// Se crea el comboBox, se definen sus atributos y valores.
		
		comboBox_inferior.setModel(new DefaultComboBoxModel(new String[] { "Dolar", "Euro", "Rubla" }));
		comboBox_inferior.setSelectedIndex(1);
		comboBox_inferior.setForeground(Color.WHITE);
		comboBox_inferior.setBorder(null);
		comboBox_inferior.setBackground(Color.DARK_GRAY);
		comboBox_inferior.setBounds(20, 430, 226, 22);
		frmConversorDeDivisas.getContentPane().add(comboBox_inferior);
		
//Action Listeners
		btn_num9.addActionListener(this);
		btn_num8.addActionListener(this);
		btn_num7.addActionListener(this);
		btn_num6.addActionListener(this);
		btn_num5.addActionListener(this);
		btn_num4.addActionListener(this);
		btn_num3.addActionListener(this);
		btn_num2.addActionListener(this);
		btn_num1.addActionListener(this);
		btn_num0.addActionListener(this);
		btn_ce.addActionListener(this);
		btn_borrarNumero.addActionListener(this);
		btn_coma.addActionListener(this);
		//TODO: action listeners
		/*
		btn_ce 				= new JButton("CE");
		btn_borrarNumero 	= new JButton("del");
		btn_coma 			= new JButton(",");
		*/
//Add to frame
		
	}
//Action listeners definidos
	@Override
	public void actionPerformed(ActionEvent actionPress) {
		//Geting info from the event
				JButton btnPress = (JButton)actionPress.getSource();
				//Getting the text of the widget
				String name = btnPress.getText();
				String combo1 = comboBox_superior.getSelectedItem().toString();
				String combo2 = comboBox_inferior.getSelectedItem().toString();
				
				switch(name) {
					case "1":
						valorNumero = valorNumero+"1";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "2":
						valorNumero = valorNumero+"2"; 
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "3":
						valorNumero = valorNumero+"3";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "4":
						valorNumero = valorNumero+"4";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "5":
						valorNumero = valorNumero+"5";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "6":
						valorNumero = valorNumero+"6";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "7":
						valorNumero = valorNumero+"7";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "8":
						valorNumero = valorNumero+"8";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "9":
						valorNumero = valorNumero+"9";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "0":
						valorNumero = valorNumero+"0";
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case "CE":
						valorNumero = func.resetValue();
						resultado = func.resetValue();
						break;
					case "del":
						valorNumero = func.backSpace(valorNumero);
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
					case ",":
						valorNumero = func.anyadirComa(valorNumero);
						resultado = func.getTypeConversion(combo1,combo2, valorNumero, this);
						break;
			}
		moneda_arriba.setText(combo1+": "+valorNumero);	
		moneda_abajo.setText(combo2+": "+resultado);
	}
	public String valorStringEmpty() {
		String retorno="";
		return retorno;
	}
}
