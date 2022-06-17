package collections.tp_1.ex_1;

public class Carre implements Forme{
    private double cote;

    public Carre(double cote) {
        this.setCote(cote);
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculAire() {
        return cote * cote;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carre{");
        sb.append("cote=").append(getCote());
        sb.append('}');
        sb.append(" Aire= ").append(calculAire());
        return sb.toString();
    }
}
