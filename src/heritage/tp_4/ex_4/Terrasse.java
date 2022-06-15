package heritage.tp_4.ex_4;

public class Terrasse extends Emplacement{
    public Terrasse(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    public String affiche() {
        final StringBuilder sb = new StringBuilder("Terrasse{");
        sb.append("dimension=").append(dimension);
        sb.append(", couleur=").append(couleur);
        sb.append(", xCentre=").append(xCentre);
        sb.append(", yCentre=").append(yCentre);
        sb.append('}');
        return sb.toString();
    }

}
