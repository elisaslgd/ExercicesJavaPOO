package org.example.exo1;

public class ApplicationChaise {

    public static void main(String[] args) {
        Chaise chaise1 = new Chaise(4, "chaine", "bleu", 14.4f);
        System.out.println(chaise1.toString());

        Chaise chaise2 = new Chaise(3, "bambou", "gris", 130.99f);
        System.out.println(chaise2.toString());

        Chaise chaise3 = new Chaise(1, "métal", "orange", 76.25f);
        System.out.println(chaise3.toString());


    }
}