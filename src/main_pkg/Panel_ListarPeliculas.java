package main_pkg;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collections;


public class Panel_ListarPeliculas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList<Peliculas> listPeliculas;
	private DefaultListModel<Peliculas> dlmodel;
	/**
	 * Create the panel.
	 */
	public Panel_ListarPeliculas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{74, 40, 273, 0};
		gridBagLayout.rowHeights = new int[]{54, 193, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		//setBounds(600, 200, 500, 300);
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		listPeliculas = new JList<Peliculas>();
		GridBagConstraints gbc_listPeliculas = new GridBagConstraints();
		gbc_listPeliculas.fill = GridBagConstraints.BOTH;
		gbc_listPeliculas.gridx = 2;
		gbc_listPeliculas.gridy = 1;
		add(listPeliculas, gbc_listPeliculas);
		
	}
	
	public DefaultListModel<Peliculas> getDlmodel() {
		return dlmodel;
	}


	
	private void alphabeticSort() {

		
		ArrayList<Peliculas> arrPeliculas = Collections.list(dlmodel.elements());
		
		/*
		 * System.out.println("Before sorting:\n");
		for (Peliculas peli : arrPeliculas) {
			System.out.println(peli);
		}
		 * */
		
		arrPeliculas.sort(new PeliculasComparator());
		
/*
 * 		System.out.println("Before sorting:\n");
		for (Peliculas peli : arrPeliculas) {
			System.out.println(peli);
		}
		
 * */
		
		dlmodel.clear();
		
		// Ordenar
		
		for (Peliculas peli : arrPeliculas) {
			dlmodel.addElement(peli);
		}

	
	}
	
	public void setDlmodel(DefaultListModel<Peliculas> dlmodel) {
		this.dlmodel = dlmodel;
		
		alphabeticSort();
		
		listPeliculas.setModel(this.dlmodel);
	}
}
