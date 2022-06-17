package collections.tp_1.ex_1;

public class Triangle implements Forme{
    private double base;
    private double hauteur;

    public Triangle(double base, double hauteur) {
        this.setBase(base);
        this.setHauteur(hauteur);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public double calculAire() {
        return (base * hauteur) / 2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangle{");
        sb.append("base=").append(getBase());
        sb.append(", hauteur=").append(getHauteur());
        sb.append('}');
        sb.append(" Aire= ").append(calculAire());
        return sb.toString();
    }
}
