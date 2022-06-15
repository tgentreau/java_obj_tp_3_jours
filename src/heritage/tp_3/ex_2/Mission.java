package heritage.tp_3.ex_2;

import java.time.LocalDate;
import java.util.Hashtable;

public class Mission {
    private String nom;
    private String description;
    private int nbrHeurePrevues;
    private Hashtable<LocalDate, Integer> releveHoraire = new Hashtable<LocalDate, Integer>();
    private Intervenant intervenant;

    public Mission(String nom, String description, int nbrHeurePrevues, Intervenant intervenant) {
        this.nom = nom;
        this.description = description;
        this.nbrHeurePrevues = nbrHeurePrevues;
        this.releveHoraire = releveHoraire;
        this.intervenant = intervenant;
    }

    public Hashtable getReleveHoraire() {
        return releveHoraire;
    }

    public Intervenant getExecutant() {
        return intervenant;
    }

    public double getNbrHeureEffectues() {
        double nbrHeurePrevues = 0;
        for (Integer value : releveHoraire.values()) {
            nbrHeurePrevues += value;
        }
        return nbrHeurePrevues;
    }

    public void ajoutReleve(LocalDate date, Integer nbrHeures) {
        releveHoraire.put(date, nbrHeures);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mission{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", nbrHeurePrevues=").append(nbrHeurePrevues);
        sb.append(", releveHoraire=").append(releveHoraire);
        sb.append('}');
        return sb.toString();
    }
}
