package editeur;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int nbrPage;
    private long isbn;
    private int annee;

    public Livre(String titre, String auteur, double prix, int nbrPage, long isbn, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbrPage = nbrPage;
        this.isbn = isbn;
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbrPage() {
        return nbrPage;
    }

    public void setNbrPage(int nbrPage) {
        this.nbrPage = nbrPage;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Livre{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", nbrPage=").append(nbrPage);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", annee=").append(annee);
        sb.append('}');
        return sb.toString();
    }
}
