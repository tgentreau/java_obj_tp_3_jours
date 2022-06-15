package heritage.tp_3.ex_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Projet {
    private String nom;
    private LocalDate debut;
    private LocalDate fin;
    private double prixFactureMO;
    private ArrayList<Mission> missions = new ArrayList<>();

    public Projet(String nom, LocalDate debut, LocalDate fin, double prixFactureMO, ArrayList<Mission> missions) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFactureMO = prixFactureMO;
        this.missions = missions;
    }

    public double cumulCoutMO() {
        double cout = 0;
        for (Mission mission : missions) {
           cout += mission.getExecutant().getTauxHoraire() * mission.getNbrHeureEffectues();
        }
        return cout;
    }

    public double margeBruteCourante() {
        return  prixFactureMO - this.cumulCoutMO();
    }
}
