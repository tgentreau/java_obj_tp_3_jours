package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(5);
        Cercle c2 = new Cercle(1.8);
        System.out.println(c1.getPerimetre(c1.rayon));
        System.out.println(c1.getSurface(c1.rayon));
        System.out.println(c2.getPerimetre(c2.rayon));
        System.out.println(c2.getSurface(c2.rayon));
    }
}
