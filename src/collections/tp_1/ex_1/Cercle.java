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
        return (rayon * rayon) * Math.PI;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cercle{");
        sb.append("rayon=").append(getRayon());
        sb.append('}');
        sb.append(" Aire= ").append(calculAire());
        return sb.toString();
    }
}
