package main_pkg;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Panel_AgregarPelicula extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfNombre;
	private JComboBox<String> cb_Genero;
	private JLabel lbl_ID;
	/**
	 * Create the panel.
	 */
	public Panel_AgregarPelicula() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{76, 11, 37, 35, 86, 1, 28, 71, 0};
		gridBagLayout.rowHeights = new int[]{23, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		//setBounds(600, 200, 500, 300);
		
		JLabel lblNewLabel = new JLabel("ID");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
	    lbl_ID = new JLabel("");
	    GridBagConstraints gbc_lbl_ID = new GridBagConstraints();
	    gbc_lbl_ID.anchor = GridBagConstraints.WEST;
	    gbc_lbl_ID.insets = new Insets(0, 0, 5, 5);
	    gbc_lbl_ID.gridx = 4;
	    gbc_lbl_ID.gridy = 1;
	    add(lbl_ID, gbc_lbl_ID);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		tfNombre = new JTextField();
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.anchor = GridBagConstraints.WEST;
		gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tfNombre.gridx = 4;
		gbc_tfNombre.gridy = 2;
		add(tfNombre, gbc_tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.WEST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 2;
		gbc_lblGenero.gridy = 3;
		add(lblGenero, gbc_lblGenero);
		
		cb_Genero = new JComboBox<String>();
		
		cb_Genero.addItem("Seleccione un genero");
		cb_Genero.addItem("Terror");
		cb_Genero.addItem("Accion");
		cb_Genero.addItem("Suspenso");
		cb_Genero.addItem("Romantica");
		
		
		GridBagConstraints gbc_cb_Genero = new GridBagConstraints();
		gbc_cb_Genero.anchor = GridBagConstraints.WEST;
		gbc_cb_Genero.insets = new Insets(0, 0, 5, 5);
		gbc_cb_Genero.gridx = 4;
		gbc_cb_Genero.gridy = 3;
		add(cb_Genero, gbc_cb_Genero);
		
		JButton btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAceptar.gridx = 4;
		gbc_btnAceptar.gridy = 4;
		add(btnAceptar, gbc_btnAceptar);
		

	}
}
