package main_pkg;

import java.awt.EventQueue;

public class Main {


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_main frame = new Ventana_main();
					frame.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
					}
				}
			});
		}
	
	
}
