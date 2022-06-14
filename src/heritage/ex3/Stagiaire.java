package heritage.ex3;

public class Stagiaire extends Personne{
    private String dateDeNaissance;
    private String adresse;
    private String codePostal;
    private String ville;

    public Stagiaire(String nom, String prenom, String dateDeNaissance, String adresse, String codePostal, String telephone, String ville) {
        super(nom, prenom, telephone);
        this.setDateDeNaissance(dateDeNaissance);
        this.setAdresse(adresse);
        this.setCodePostal(codePostal);
        this.setVille(ville);
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stagiaire{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append(", dateDeNaissance='").append(dateDeNaissance).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", codePostal='").append(codePostal).append('\'');
        sb.append(", ville='").append(ville).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
