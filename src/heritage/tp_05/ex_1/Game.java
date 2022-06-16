package heritage.tp_05.ex_1;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int randomIntFacile = random.nextInt(100) + 1;
    private int randomIntMoyen = random.nextInt(1000) + 1;
    private int essais = 10;

    public int getRandomIntFacile() {
        return randomIntFacile;
    }

    public int getRandomIntMoyen() {
        return randomIntMoyen;
    }

    public int getEssais() {
        return essais;
    }

    public void setUp() {
        System.out.println("Veuillez choisir un niveau de difficulté");
        System.out.println("1- Facile");
        System.out.println("2- Moyen");
        System.out.println("3- Difficile");
        int choix = scanner.nextInt();
        if(choix == 1) {
            facile();
        } else if(choix == 2) {
            moyen();
        } else if(choix == 3) {
            difficile();
        } else {
            System.out.println("Mauvaise entrée");
        }
    }

    public void facile() {
        System.out.println("New game");
        System.out.println("Veuillez entrer un nombre aléatoire entre 1 et 100");
        System.out.println("Vous avez " + essais + " essais");
        while (essais != 0) {
            int result = scanner.nextInt();
            if(result < randomIntFacile) {
                System.out.println("Trop petit");
                essais--;
                System.out.println("Essais restant: " + essais);
            } else if(result > randomIntFacile) {
                System.out.println("Trop grand");
                essais--;
                System.out.println("Essais restant: " + essais);
            } else if(result == randomIntFacile) {
                System.out.println("Vous avez gagné, Bravo !");
                restart();
            }
            if(essais == 0) {
                System.out.println("Game over");
                restart();
            }
        }
    }

    public void moyen() {
        System.out.println("New game");
        System.out.println("Veuillez entrer un nombre aléatoire entre 1 et 1000");
        System.out.println("Vous avez " + essais + " essais");
        while (essais != 0) {
            int result = scanner.nextInt();
            if(result < randomIntMoyen) {
                System.out.println("Trop petit");
                essais--;
                System.out.println("Essais restant: " + essais);
            } else if(result > randomIntMoyen) {
                System.out.println("Trop grand");
                essais--;
                System.out.println("Essais restant: " + essais);
            } else if(result == randomIntMoyen) {
                System.out.println("Vous avez gagné, Bravo !");
                restart();
            }
            if(essais == 0) {
                System.out.println("Game over");
                restart();
            }
        }
    }

    public void difficile() {
        System.out.println("New game");
        System.out.println("Veuillez entrer un nombre aléatoire entre 1 et 1000");
        System.out.println("Vous avez " + essais + " essais");
        while (essais != 0) {
            int result = scanner.nextInt();
            if(result < randomIntMoyen || result > randomIntMoyen) {
                System.out.println("Raté");
                essais--;
                System.out.println("Essais restant: " + essais);
            } else if(result == randomIntMoyen) {
                System.out.println("Vous avez gagné, Bravo !");
                restart();
            }
            if(essais == 0) {
                System.out.println("Game over");
                restart();
            }
        }
    }

    public void restart () {
        System.out.println("Voulez-vous relancer le jeu ?");
        System.out.println("1- Oui");
        System.out.println("2- Non");
        int restart = scanner.nextInt();
        if(restart == 1) {
            essais = 10;
            setUp();
        } else if (restart == 2) {
            System.exit(0);
        } else {
            System.out.println("Mauvaise entrée");
        }
    }

}
