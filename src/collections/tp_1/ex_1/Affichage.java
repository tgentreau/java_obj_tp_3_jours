package collections.tp_1.ex_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Affichage {
    Scanner scanner = new Scanner(System.in);
    List<Forme> formes = new ArrayList<>();

    public void setUp() {
        System.out.println("Quelle forme voulez-vous ?");
        System.out.println("1- Triangle");
        System.out.println("2- Carré");
        System.out.println("3- Rectangle");
        System.out.println("4- Cercle");
        System.out.println("5- Losange");
        int choix = scanner.nextInt();
        if(choix == 1) {
            calculAireTriangle();
        } else if(choix == 2) {
            calculAireCarre();
        } else if(choix == 3) {
            calculAireRectangle();
        } else if(choix == 4) {
            calculAireCercle();
        } else if(choix == 5) {
            calculAireLosange();
        } else {
            System.out.println("Mauvaise entrée");
        }
    }

    public void calculAireTriangle() {
        System.out.println("Quelle est la longueur de la base ?");
        double baseTriangle = scanner.nextDouble();
        System.out.println("Quelle est la longueur de la hauteur ?");
        double hauteurTriangle = scanner.nextDouble();
        Triangle triangle = new Triangle(baseTriangle, hauteurTriangle);
        formes.add(triangle);
        restart();
    }

    public void calculAireCarre() {
        System.out.println("Quelle est la longueur du coté ?");
        double coteTriangle = scanner.nextDouble();
        Carre carre = new Carre(coteTriangle);
        formes.add(carre);
        restart();
    }

    public void calculAireCercle() {
        System.out.println("Quelle est la longueur du rayon ?");
        double rayonCercle = scanner.nextDouble();
        Cercle cercle = new Cercle(rayonCercle);
        formes.add(cercle);
        restart();
    }

    public void calculAireRectangle() {
        System.out.println("Quelle est la longueur du rectangle ?");
        double longueurRectangle = scanner.nextDouble();
        System.out.println("Quelle est la largeur du rectangle ?");
        double largeurRectangle = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(longueurRectangle, largeurRectangle);
        formes.add(rectangle);
        restart();
    }

    public void calculAireLosange() {
        System.out.println("Quelle est la longueur de la base ?");
        double base = scanner.nextDouble();
        System.out.println("Quelle est la longueur de la hauteur ?");
        double hauteur = scanner.nextDouble();
        Losange losange = new Losange(base, hauteur);
        formes.add(losange);
        restart();
    }

    public void printForme() {
        for (Forme forme : formes) {
            System.out.println("Forme : " + forme.toString());
        }
    }

    public void restart() {
        System.out.println("Une autre forme ?");
        System.out.println("1- Oui");
        System.out.println("2- Non");
        int choixRestart = scanner.nextInt();
        if(choixRestart == 1) {
            setUp();
        } else if(choixRestart == 2) {
            printForme();
            choixCalculs();
        } else {
            System.err.println("Mauvaise entrée");
        }
    }

    public void choixCalculs() {
        System.out.println("Quels calculs souhaitez-vous connaître ?");
        System.out.println("1- L'aire ?");
        System.out.println("2- Le périmètre ?");
        System.out.println("3- Les deux ?");
        int choixCalculs = scanner.nextInt();
        if(choixCalculs == 1) {
            for (Forme forme : formes) {
                System.out.println(forme.toString() + " Aire= " + forme.calculAire());
            }
        } else if(choixCalculs == 2){
            for (Forme forme : formes) {
                System.out.println(forme.toString() + " Périmètre= " + forme.calculPerimetre());
            }
        } else if(choixCalculs == 3) {
            for (Forme forme : formes) {
                System.out.println(forme.toString() + " Aire= " + forme.calculAire() + " Périmètre= " + forme.calculPerimetre());
            }
        } else {
            System.err.println("Mauvaise entrée");
        }
    }
}
