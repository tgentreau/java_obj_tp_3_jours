package heritage.mesMachines;


import java.time.LocalDate;

public class TestMachine {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        MachineEssence machineEssence = new MachineEssence(date, "La marque", "le modele", 50);
        MachineElectrique machineElectrique = new MachineElectrique(date, "marque elec", "modele elec", 100);
        BassinADecanter bassinADecanter = new BassinADecanter(date, "marque bassin", "modele bassin", 500);
        PompeAGravitation pompeAGravitation = new PompeAGravitation(date, "marque pompe", "modele pompe", 50, 15, true);
        System.out.println(machineEssence.toString());
        System.out.println(machineElectrique.toString());
        System.out.println(bassinADecanter.toString());
        System.out.println(pompeAGravitation.toString());
    }
}
