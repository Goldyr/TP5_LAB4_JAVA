package main_pkg;


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
import java.awt.FlowLayout;


public class Ventana_main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JMenuBar menuBar;
	private JMenu mbPelicula;
	private JMenuItem mbiAgregar;
	private JMenuItem mbiListar;
	
	//private static JList lista;
	//private DefaultListModel<Peliculas> dlmodel;


	public Ventana_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 650, 500);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mbPelicula = new JMenu("Peliculas");
		menuBar.add(mbPelicula);
		
		mbiAgregar = new JMenuItem("Agregar");
		mbiAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				Panel_AgregarPelicula panel = new Panel_AgregarPelicula();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
				System.out.println("agregar");

			}
		});
		mbPelicula.add(mbiAgregar);
		
		mbiListar = new JMenuItem("Listar");
		mbPelicula.add(mbiListar);
		mbiListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				Panel_ListarPeliculas panel = new Panel_ListarPeliculas();
				//panel.setDlmodel(dlmodel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
				System.out.println("listar");
			}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTpgrupo = new JLabel("TP5-GRUPO5");
		lblTpgrupo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTpgrupo);
	}
}
