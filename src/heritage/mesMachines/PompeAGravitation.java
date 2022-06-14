package heritage.mesMachines;

import java.time.LocalDate;

public class PompeAGravitation extends MachineEssence{
    private int debit;
    private boolean eauOperationnelle;

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int puissanceCV, int debit, boolean eauOperationnelle) {
        super(dateAchat, marque, modele, puissanceCV);
        this.debit = debit;
        this.eauOperationnelle = eauOperationnelle;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public boolean isEauOperationnelle() {
        return eauOperationnelle;
    }

    public void setEauOperationnelle(boolean eauOperationnelle) {
        this.eauOperationnelle = eauOperationnelle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PompeAGravitation{");
        sb.append(super.toString());
        sb.append("debit=").append(debit);
        sb.append(", eauOperationnelle=").append(eauOperationnelle);
        sb.append('}');
        return sb.toString();
    }
}
