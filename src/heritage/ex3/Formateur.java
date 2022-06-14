package heritage.ex3;

public class Formateur extends Personne{
    private int numeroIntervenant;
    private String dateDeCreation;
    static private int nombreIntervenant;

    public Formateur(String nom, String prenom, String telephone, String dateDeCreation, int numeroIntervenant, int nombreIntervenant) {
        super(nom, prenom, telephone);
        this.setDateDeCreation(dateDeCreation);
        this.setNumeroIntervenant(numeroIntervenant);
        this.setNombreIntervenant(nombreIntervenant);
    }

    public int getNumeroIntervenant() {
        return numeroIntervenant;
    }

    public void setNumeroIntervenant(int numeroIntervenant) {
        this.numeroIntervenant = numeroIntervenant;
    }

    public String getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(String dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }


    public int getNombreIntervenant() {
        return nombreIntervenant;
    }

    public void setNombreIntervenant(int nombreIntervenant) {
        this.nombreIntervenant = nombreIntervenant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Formateur{");
        sb.append("numeroIntervenant=").append(numeroIntervenant);
        sb.append(", dateDeCreation='").append(dateDeCreation).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
