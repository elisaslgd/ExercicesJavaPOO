package org.example.exo1;

public class Chaise {

    private int nombrepieds;
    private String materiaux;
    private String couleur;
    private float prix;


    public Chaise (int nombrepieds, String materiaux, String couleur, float prix){
        this.nombrepieds = nombrepieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec " +
                 nombrepieds + " pied(s) " + "en " +
                 materiaux + " de couleur " +
                 couleur + " à un prix de "+
                 prix + "e.";

    }



}
