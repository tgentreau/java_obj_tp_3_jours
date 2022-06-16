package heritage.tp_4.ex_5;

import java.time.LocalDate;

public class MiniExcursionPlanifiee{
    private LocalDate heureDepart;
    private int nbrInscrits;
    private MiniExcursion miniExcursion;
    private String heureDepart2;

    public MiniExcursionPlanifiee(LocalDate heureDepart, int nbrInscrits, MiniExcursion miniExcursion) {
        this.setHeureDepart(heureDepart);
        this.setNbrInscrits(nbrInscrits);
        this.setMiniExcursion(miniExcursion);
    }

    public MiniExcursionPlanifiee(String heureDepart2, int nbrInscrits, MiniExcursion miniExcursion) {
        this.setHeureDepart2(heureDepart2);
        this.setNbrInscrits(nbrInscrits);
        this.setMiniExcursion(miniExcursion);
    }

    public boolean estComplete() {
        boolean complet = false;
        if(nbrInscrits == miniExcursion.getNombrePlace()) {
            complet = true;
        }
        return complet;
    }

    public String getHeureDepart2() {
        return heureDepart2;
    }

    public void setHeureDepart2(String heureDepart2) {
        this.heureDepart2 = heureDepart2;
    }

    public LocalDate getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalDate heureDepart) {
        this.heureDepart = heureDepart;
    }

    public int getNbrInscrits() {
        return nbrInscrits;
    }

    public void setNbrInscrits(int nbrInscrits) {
        this.nbrInscrits = nbrInscrits;
    }

    public MiniExcursion getMiniExcursion() {
        return miniExcursion;
    }

    public void setMiniExcursion(MiniExcursion miniExcursion) {
        this.miniExcursion = miniExcursion;
    }
}
