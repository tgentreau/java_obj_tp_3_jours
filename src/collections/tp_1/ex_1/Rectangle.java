package collections.tp_1.ex_1;

public class Rectangle implements Forme{
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.setLargeur(largeur);
        this.setLongueur(longueur);
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double calculAire() {
        return largeur * longueur;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("longueur=").append(getLongueur());
        sb.append(", largeur=").append(getLargeur());
        sb.append('}');
        sb.append(" Aire= ").append(calculAire());
        return sb.toString();
    }
}
