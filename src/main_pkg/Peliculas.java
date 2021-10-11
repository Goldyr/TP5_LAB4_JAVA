package main_pkg;

public class Peliculas implements Comparable <Peliculas> {

	private int ID;
	private String Nombre;
	private Categorias Genero;
	private static int cant=1;
	
	public Peliculas() {
		ID = cant;
		cant++;
	}
	
	public Peliculas(String nombre, Categorias genero) {
		super();
		ID = cant;
		Nombre = nombre;
		Genero = genero; 
		cant++;
	}
	
	static public int getProxid() {
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

	@Override
	public String toString() {
		return  ID +"- " + Nombre + "- " + Genero;
	}

	@Override
	public int compareTo(Peliculas o) {
		int devolver;
		devolver= o.getNombre().compareTo(this.Nombre);
		if(devolver >0 ){return -1;}
		else {if(devolver < 0) {return 1;}else{return 0;}}
	}
	
	
}
