package main_pkg;

public class Peliculas {

	private int ID;
	private String Nombre;
	private Categorias Genero;
	private static int cant=1;
	
	public Peliculas(int iD, String nombre, String genero) {
		super();
		ID = cant;
		Nombre = nombre;
		Genero.setNombre(genero); 
		cant++;
	}
	
	public int getProxid() {
		return cant;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Categorias getGenero() {
		return Genero;
	}
	public void setGenero(Categorias genero) {
		Genero = genero;
	}
	
	
}
