package heritage;

public class TestSalarie {
    public static void main(String[] args) {
        Individu individu = new Individu("Thomas", "Gentreau");
        System.out.println("Individu: " + individu.toString());
        Salarie salarie = new Salarie("Toto", "tutu", 10000);
        System.out.println("Salarie: " + salarie.toString());
    }
}
