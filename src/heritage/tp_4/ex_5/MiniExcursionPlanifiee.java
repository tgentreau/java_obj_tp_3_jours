package heritage.tp_4.ex_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MiniExcursionPlanifiee{
    private LocalDateTime heureDepart;
    private int nbrInscrits;
    private MiniExcursion miniExcursion;

    public MiniExcursionPlanifiee(LocalDate heureDepart, int nbrInscrits, MiniExcursion miniExcursion) {
        this.setHeureDepart(LocalDateTime.of(heureDepart, LocalTime.of(8, 0)));
        this.setNbrInscrits(nbrInscrits);
        this.setMiniExcursion(miniExcursion);
    }

    public MiniExcursionPlanifiee(String heureDepart, int nbrInscrits, MiniExcursion miniExcursion) {
        String[] tabHeureDepart = heureDepart.split("h");
        int heure = Integer.parseInt(tabHeureDepart[0]);
        int minute = Integer.parseInt(tabHeureDepart[1]);
        this.setHeureDepart(LocalDateTime.of(LocalDate.now(), LocalTime.of(heure, minute)));
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

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalDateTime heureDepart) {
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
