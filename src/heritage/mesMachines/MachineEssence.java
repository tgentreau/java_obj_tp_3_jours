package heritage.mesMachines;

import java.time.LocalDate;

public class MachineEssence extends Machine{
    private int puissanceCV;

    public MachineEssence(LocalDate dateAchat, String marque, String modele, int puissanceCV) {
        super(dateAchat, marque, modele);
        this.setPuissanceCV(puissanceCV);
    }

    public int getPuissanceCV() {
        return puissanceCV;
    }

    public void setPuissanceCV(int puissanceCV) {
        this.puissanceCV = puissanceCV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineEssence{");
        sb.append(super.toString());
        sb.append("puissanceCV=").append(puissanceCV);
        sb.append('}');
        return sb.toString();
    }
}
