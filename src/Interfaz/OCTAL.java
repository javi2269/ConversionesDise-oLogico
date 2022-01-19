package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OCTAL extends JFrame {

	private JPanel contentPane;
	private JTextField a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OCTAL frame = new OCTAL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OCTAL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_decimal = new JPanel();
		panel_decimal.setBackground(Color.PINK);
		contentPane.add(panel_decimal);
		panel_decimal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OCTAL A BINARIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 211, 37);
		panel_decimal.add(lblNewLabel);
		
		a = new JTextField();
		a.setBounds(10, 84, 211, 20);
		panel_decimal.add(a);
		a.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESE EL NUMERO OCTAL");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 59, 211, 14);
		panel_decimal.add(lblNewLabel_1);
		
		JButton calcular = new JButton("CALCULAR");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b = Integer.parseInt(a.getText());
				oct_bin op = new oct_bin();
				op.opDO(b);
				JOptionPane.showMessageDialog(null, "El resultado es: " + op.getresultado());
				
			}
		});
		calcular.setBounds(59, 115, 120, 23);
		panel_decimal.add(calcular);
		
		JButton regresar = new JButton("REGRESAR");
		regresar.setBounds(59, 149, 120, 23);
		panel_decimal.add(regresar);
		regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio in=new Inicio();
				in.setVisible(true);
				dispose();
				in.setLocationRelativeTo(null);
			}
		});
	}

}
