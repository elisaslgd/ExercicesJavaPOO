package org.example.exo3;

public class Joueur {

    private String nom;
    private int niveau;
    private int ptsexp;


    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPtsexp() {
        return ptsexp;
    }

    public void setPtsexp(int ptsexp) {
        this.ptsexp = ptsexp;
    }

    public void effectuerUneQuete(int num){
        this.ptsexp += 10;
        System.out.println(this.nom + "effectue la quête !" + num);
    }

    public void levelup () {
        if (ptsexp > 100) {
            niveau += 1;
        }
    }

    @Override
    public String toString() {
        return "Le joueur " + nom + "effectue la quête n° " + niveau;

    }
}
