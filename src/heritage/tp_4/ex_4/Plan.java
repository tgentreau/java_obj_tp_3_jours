package heritage.tp_4.ex_4;

import java.util.ArrayList;

public class Plan {
    private int echelle;
    private String nomFichier;
    private ArrayList<Emplacement> emplacements = new ArrayList<>();

    public Plan(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String affichePlan() {
        final StringBuilder sb = new StringBuilder("Plan{");
        sb.append(", nomFichier='").append(nomFichier).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void ajouteEmplacement(Emplacement emplacement) {
        emplacements.add(emplacement);
    }

    public void supprimeEmplacement(Emplacement emplacement) {
        emplacements.remove(emplacement);
    }
}
