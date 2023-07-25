package org.example.base;

public class Voiture {

    //Attributs d'instance
    //<visibilité><type><nom>
    //public = accessible en dehors de la classe
    public String couleur;
    public int carburant;
    public int puissance;

    //private : accessible uniquement dans la classe
    private String marque;

    //protected : accessible dans la classe et dans les enfants qui héritent de cette classe
    protected int nombrePortes;


    //Constructeur
    // Définit comment est construite la classe
    public Voiture(){
        System.out.println("Je suis dans le constructeur sans paramètres");
    }

    //Polymorphisme: possibilité de définir plusieurs méthodes avec le même nom mais des signatures différentes
    public Voiture (String couleur){
        //this(<paramètres>) appelle le constructeur avec la signature similaire
        this();
        System.out.println("Je suis dans le constructeur avec la couleur");
        this.couleur = couleur;

    }

    public Voiture(String couleur, int carburant, int puissance){
        //this.couleur = couleur;
        this(couleur);
        this.carburant = carburant;
        this.puissance = puissance;
        System.out.println("Je suis dans le constructeur avec tous les attributs");
    }

    //Méthode d'instance

    //<visibilité><type de retour><nom>(<paramètres>)
    public void demarrer(){
        System.out.println("La voiture démarre");
    }

    public void freiner (){
        System.out.println("La voiture freine");
    }

    public void remplirReservoir(int volume){
        carburant += volume;
    }

    public double puissanceCF (){
        return puissance / 7.;
    }

    //Destructeur
    protected void finalize(){

    }



}
