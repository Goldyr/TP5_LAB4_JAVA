package main_pkg;

import java.util.Comparator;

public class PeliculasComparator implements Comparator<Peliculas>{


    @Override
    public int compare(Peliculas pel1, Peliculas pel2) {
        return pel1.getNombre().compareTo(pel2.getNombre());
    }

}