package heritage.tp_4.ex_5;

import java.time.LocalTime;

public class Etape {
    private int numEtape;
    private String description;
    private int dureePrevue;

    public Etape(String description, int dureePrevue) {
        this.description = description;
        this.dureePrevue = dureePrevue;
    }

    public int getNumEtape() {
        return numEtape;
    }

    public void setNumEtape(int numEtape) {
        this.numEtape = numEtape;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public LocalTime donneeDureePrevueHHMM() {
        LocalTime time = LocalTime.ofSecondOfDay(dureePrevue * 60L);
        return time;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Etape{");
        sb.append("numEtape=").append(numEtape);
        sb.append(", description='").append(description).append('\'');
        sb.append(", dureePrevue=").append(dureePrevue);
        sb.append('}');
        return sb.toString();
    }
}
