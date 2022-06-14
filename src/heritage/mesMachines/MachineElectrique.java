package heritage.mesMachines;

import java.time.LocalDate;

public class MachineElectrique extends Machine{
    private int puissanceW;
    public MachineElectrique(LocalDate dateAchat, String marque, String modele, int puissanceW) {
        super(dateAchat, marque, modele);
        this.setPuissanceW(puissanceW);
    }

    public int getPuissanceW() {
        return puissanceW;
    }

    public void setPuissanceW(int puissanceW) {
        this.puissanceW = puissanceW;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineElectrique{");
        sb.append(super.toString());
        sb.append("puissanceW=").append(puissanceW);
        sb.append('}');
        return sb.toString();
    }
}
