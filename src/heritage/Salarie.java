package heritage;

public class Salarie extends Individu{
    private int salaire;

    public Salarie(String prenom, String nom, int salaire) {
        super(prenom, nom);
        this.setSalaire(salaire);
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
