package heritage.mesMachines;

import java.time.LocalDate;

public class BassinADecanter extends Machine{
    private int capaciteHl;

    public BassinADecanter(LocalDate dateAchat, String marque, String modele, int capaciteHl) {
        super(dateAchat, marque, modele);
        this.setCapaciteHl(capaciteHl);
    }

    public int getCapaciteHl() {
        return capaciteHl;
    }

    public void setCapaciteHl(int capaciteHl) {
        this.capaciteHl = capaciteHl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BassinADecanter{");
        sb.append(super.toString());
        sb.append("capaciteHl=").append(capaciteHl);
        sb.append('}');
        return sb.toString();
    }
}
