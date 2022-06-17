package collections.tp_1.ex_1;

public class Cercle implements Forme{
    private double rayon;

    public Cercle(double rayon) {
        this.setRayon(rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculAire() {
        return (getRayon() * getRayon()) * Math.PI;
    }

    @Override
    public double calculPerimetre() {
        return 2 * Math.PI * getRayon();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cercle{");
        sb.append("rayon=").append(getRayon());
        sb.append('}');
        return sb.toString();
    }
}
