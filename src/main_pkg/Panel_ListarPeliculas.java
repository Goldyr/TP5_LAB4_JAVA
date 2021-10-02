package main_pkg;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		setLayout(null);
		//setBounds(600, 200, 500, 300);
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		lblNewLabel.setBounds(74, 141, 40, 14);
		add(lblNewLabel);
		
		listPeliculas = new JList<Peliculas>();
		listPeliculas.setBounds(138, 54, 273, 193);
		add(listPeliculas);
	}
	
	public DefaultListModel<Peliculas> getDlmodel() {
		return dlmodel;
	}

	public void setDlmodel(DefaultListModel<Peliculas> dlmodel) {
		this.dlmodel = dlmodel;
	}

}
