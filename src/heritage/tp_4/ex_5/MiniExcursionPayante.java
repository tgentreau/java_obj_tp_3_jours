package heritage.tp_4.ex_5;

import java.util.List;

public class MiniExcursionPayante extends MiniExcursion{
    private float tarif;

    public MiniExcursionPayante(String libelleExcursion, int nombrePlace, List<Etape> lesEtapes, float tarif) {
        super(libelleExcursion, nombrePlace, lesEtapes);
        this.setTarif(tarif);
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
