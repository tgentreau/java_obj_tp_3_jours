package heritage.tp_05.ex_1;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        int essais = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("New game");
        System.out.println("Veuillez entrer un nombre aléatoire entre 1 et 100");
        System.out.println("Vous avez " + essais + " essais");
        while (essais != 0) {
            int result = scanner.nextInt();
            if(result < randomInt) {
                System.out.println("Trop petit");
                essais--;
                System.out.println("Essais restant: " + essais);
            } else if(result > randomInt) {
                System.out.println("Trop grand");
                essais--;
                System.out.println("Essais restant: " + essais);
            } else if(result == randomInt) {
                System.out.println("Vous avez gagné, Bravo !");
                scanner.close();
            }
            if(essais == 0) {
                System.out.println("Game over");
            }
        }

    }
}
