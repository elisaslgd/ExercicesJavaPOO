package org.example.exo2;

public class ApplicationFilm {

    public static void main(String[] args) {

        Film film = new Film();

        film.setGenre("Drame");
        film.setRealisateur("Mathieu Kassovitz");
        film.setTitre("La Haine");
        film.setDateSortie("1995-05-31");

        System.out.println(film.toString());

        film.setGenre("Action");
        film.setTitre("Avatar 2");
        film.setDateSortie("2022-12-14");
        film.setRealisateur("James Cameroun");

        System.out.println(film.toString());



    }

}
