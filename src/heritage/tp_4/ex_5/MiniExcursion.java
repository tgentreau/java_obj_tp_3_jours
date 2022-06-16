package heritage.tp_4.ex_5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MiniExcursion {
    protected int numMiniExcursion;
    protected String libelleExcursion;
    protected int nombrePlace;
    protected List<Etape> lesEtapes = new ArrayList<>();
    protected int numeroExcursion = lesEtapes.size();

    public MiniExcursion(String libelleExcursion, int nombrePlace, List<Etape> lesEtapes) {
        this.setLibelleExcursion(libelleExcursion);
        this.setNombrePlace(nombrePlace);
        this.setLesEtapes(lesEtapes);
    }

    public List<Etape> getLesEtapes() {
        return lesEtapes;
    }

    public void setLesEtapes(List<Etape> lesEtapes) {
        this.lesEtapes = lesEtapes;
    }

    public int getNumMiniExcursion() {
        return numMiniExcursion;
    }

    public void setNumMiniExcursion(int numMiniExcursion) {
        this.numMiniExcursion = numMiniExcursion;
    }

    public String getLibelleExcursion() {
        return libelleExcursion;
    }

    public void setLibelleExcursion(String libelleExcursion) {
        this.libelleExcursion = libelleExcursion;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public void ajouteEtape(Etape uneEtape) {
        lesEtapes.add(uneEtape);
    }

    public int donneDureePrevue() {
        int donnee = 0;
        for (Etape lesEtape : lesEtapes) {
            donnee = Integer.parseInt(lesEtape.donneeDureePrevueHHMM().format(DateTimeFormatter.ofPattern("MM")));
        }
        return donnee;
    }

    public LocalTime donneDureePrevueHHMM() {
        int duree = 0;
        for (Etape etape : lesEtapes) {
            duree += etape.getDureePrevue();
        }
        return LocalTime.ofSecondOfDay(duree * 60L);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MiniExcursion{");
        sb.append("numMiniExcursion=").append(numMiniExcursion);
        sb.append(", libelleExcursion='").append(libelleExcursion).append('\'');
        sb.append(", nombrePlace=").append(nombrePlace);
        sb.append(", lesEtapes=").append(lesEtapes);
        sb.append(", numeroExcursion=").append(numeroExcursion);
        sb.append('}');
        return sb.toString();
    }
}
