package editeur;

public class TestLivre {
    public static void main(String[] args) {
        Livre livre = new Livre("Le nom du vent", "Patrick Rothfuss", 12.50, 797, 4665165, 2007);
        System.out.println(livre.getTitre());
    }
}
