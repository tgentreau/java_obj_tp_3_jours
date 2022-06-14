package heritage.ex3;

public class TestPersonne {
    public static void main(String[] args) {
        Stagiaire stagiaire = new Stagiaire("Thomas", "Gentreau", "19/07/1994", "la rue d'ici et d'ailleurs", "40100", "0638274319", "Dax");
        Formateur formateur = new Formateur("Toto", "Tutu", "0558585858", "18/11/2020", 65464, 2);
        System.out.println(stagiaire);
        System.out.println(formateur);
    }
}
