package fr.diginamic.entities;

public class Cercle {
    public double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getPerimetre(double rayon) {
        return 2 * Math.PI * rayon;
    }

    public double getSurface(double rayon) {
        return (rayon * rayon) * Math.PI;
    }
}
