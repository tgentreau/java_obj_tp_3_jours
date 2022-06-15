package heritage.tp_3.ex_1;

public class Individu {
    private String nom;
    private String prenom;

    public Individu(String nom, String prenom) {
        this.setNom(nom);
        this.setPrenom(prenom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Individu{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
