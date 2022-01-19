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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("OPCIONES");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("SALIR");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JPanel panel_inicio = new JPanel();
		panel_inicio.setBackground(Color.PINK);
		contentPane.add(panel_inicio);
		panel_inicio.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSIONES NUMERICAS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(52, 11, 322, 33);
		panel_inicio.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SISTEMAS NUMERICOS A NUMEROS BINARIOS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(52, 54, 322, 33);
		panel_inicio.add(lblNewLabel_1);
		
		JButton dec_bin = new JButton("DECIMAL");
		dec_bin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dec_bin.setBounds(52, 153, 95, 48);
		panel_inicio.add(dec_bin);
		dec_bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DECIMAL dec=new DECIMAL();
				dec.setVisible(true);
				dispose();
				dec.setLocationRelativeTo(null);
			}
		});
		
		JButton oct_bin = new JButton("OCTAL");
		oct_bin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		oct_bin.setBounds(279, 153, 95, 48);
		panel_inicio.add(oct_bin);
		oct_bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OCTAL oct=new OCTAL();
				oct.setVisible(true);
				dispose();
				oct.setLocationRelativeTo(null);
			}
		});
		
		JButton hex_bin = new JButton("HEXADECIMAL");
		hex_bin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		hex_bin.setBounds(159, 153, 110, 48);
		panel_inicio.add(hex_bin);
		hex_bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HEXADECIMAL hex=new HEXADECIMAL();
				hex.setVisible(true);
				dispose();
				hex.setLocationRelativeTo(null);
			}
		});
	}
}
