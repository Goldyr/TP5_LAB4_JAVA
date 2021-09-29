package main_pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana_main extends JFrame {

	private JPanel contentPane;
	
	private JMenuBar menuBar;
	private JMenu mbPelicula;
	private JMenuItem mbiAgregar;
	private JMenuItem mbiListar;
	
	private Ventana_Agregar frameAlta;
	private Ventana_Listar frameListado; 


	public Ventana_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 250, 160);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mbPelicula = new JMenu("Peliculas");
		menuBar.add(mbPelicula);
		
		mbiAgregar = new JMenuItem("Agregar");
		mbiAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameAlta = new Ventana_Agregar();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frameAlta = new Ventana_Agregar();
							frameAlta.setVisible(true);
							} catch (Exception e) {
							e.printStackTrace();
							}
						}
					});
			}
		});
		mbPelicula.add(mbiAgregar);
		
		mbiListar = new JMenuItem("Listar");
		mbPelicula.add(mbiListar);
		mbiListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameListado = new Ventana_Listar();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frameListado = new Ventana_Listar();
							frameListado.setVisible(true);
							} catch (Exception e) {
							e.printStackTrace();
							}
						}
					});
			}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTpgrupo = new JLabel("TP5-GRUPO5");
		lblTpgrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTpgrupo.setBounds(70, 30, 91, 40);
		contentPane.add(lblTpgrupo);
	}
}
