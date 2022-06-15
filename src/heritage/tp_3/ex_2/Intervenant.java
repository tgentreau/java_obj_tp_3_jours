package heritage.tp_3.ex_2;

public class Intervenant {
    private String nom;
    private double tauxHoraire;

    public Intervenant(String nom, double tauxHoraire) {
        this.nom = nom;
        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Intervenant{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", tauxHoraire=").append(tauxHoraire);
        sb.append('}');
        return sb.toString();
    }
}
