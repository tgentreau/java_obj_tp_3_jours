package heritage.tp_3.ex_1;

import java.awt.*;

public class Voiture {
    private int num_serie;
    private String immatriculation;
    private String marque;
    private Color couleur;
    private int annee;
    private Individu propriaitaire;

    public Voiture(int num_serie, String immatriculation, String marque, Color couleur, int annee) {
        this.setNum_serie(num_serie);
        this.setImmatriculation(immatriculation);
        this.setMarque(marque);
        this.setCouleur(couleur);
        this.setAnnee(annee);
    }

    public void demarrer() {
        System.out.println("Je démarre vroum vroum");
    }

    public void klaxonner() {
        System.out.println("Je klaxonne tut tut");
    }

    public void conduire() {
        System.out.println("Je conduis");
    }

    public void arreter() {
        System.out.println("je m'arrete");
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getPropriaitaire() {
        return annee;
    }

    public void setPropriaitaire(Individu propriaitaire) {
        this.propriaitaire = propriaitaire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voiture{");
        sb.append("num_serie=").append(num_serie);
        sb.append(", immatriculation='").append(immatriculation).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", couleur='").append(couleur).append('\'');
        sb.append(", annee=").append(annee);
        sb.append('}');
        return sb.toString();
    }
}
