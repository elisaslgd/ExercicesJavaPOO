package org.example.base;

public class ApplicationBase {
    public static void main(String[] args) {
        //Instanciation d'un objet voiture
        Voiture voiture1 = new Voiture();

        //Pour executer une méthode d'instance, il suffit de faire objet.methode(<paramètres>)
        voiture1.demarrer();

        //Pour acceder à un attribut public, il suffit de faire object.attribut
        System.out.println(voiture1.carburant);

        voiture1.remplirReservoir(15);

        voiture1.carburant += 1;

        System.out.println(voiture1.carburant);
        System.out.println(voiture1.couleur);

        System.out.println("###### Voiture 2 #####");
        Voiture v2 = new Voiture("rouge", 50, 120);

        System.out.println("###### Voiture 3 #####");
        Voiture v3 = new Voiture("champagne");

        double chevauxFiscaux = v2.puissanceCF();

    }

}
