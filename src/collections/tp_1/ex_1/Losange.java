package collections.tp_1.ex_1;

public class Losange implements Forme{
    private double base;
    private double hauteur;

    public Losange(double base, double hauteur) {
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
        return (getBase() * getHauteur()) / 2;
    }

    @Override
    public double calculPerimetre() {
        return getBase() + getHauteur() + Math.sqrt(getBase() * getBase() + getHauteur() * getHauteur());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Losange{");
        sb.append("base =").append(getBase());
        sb.append("hauteur B=").append(getHauteur());
        sb.append('}');
        return sb.toString();
    }
}
