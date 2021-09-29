package main_pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana_Listar extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mbPelicula;
	private JMenuItem mbiAgregar;
	private JMenuItem mbiListar;

	private Ventana_Agregar frameAlta;
	private Ventana_Listar frameListado; 
	
	public Ventana_Listar() {
		//para que quede mas ordenado por si necesitan hacer otro constructor
		visualSettings();
	}
	
	//Configuracion inicial
	private void visualSettings() {
		setTitle("Listar Peliculas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
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
		
		setBounds(640, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
