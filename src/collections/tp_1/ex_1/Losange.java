package collections.tp_1.ex_1;

public class Losange implements Forme{
    private double diagonaleA;
    private double diagonaleB;

    public Losange(double diagonaleA, double diagonaleB) {
        this.setDiagonaleA(diagonaleA);
        this.setDiagonaleB(diagonaleB);
    }

    public double getDiagonaleA() {
        return diagonaleA;
    }

    public void setDiagonaleA(double diagonaleA) {
        this.diagonaleA = diagonaleA;
    }

    public double getDiagonaleB() {
        return diagonaleB;
    }

    public void setDiagonaleB(double diagonaleB) {
        this.diagonaleB = diagonaleB;
    }

    @Override
    public double calculAire() {
        return (diagonaleA * diagonaleB) / 2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Losange{");
        sb.append("diagonale A=").append(diagonaleA);
        sb.append("diagonale B=").append(diagonaleB);
        sb.append('}');
        sb.append(" Aire= ").append(calculAire());
        return sb.toString();
    }
}
