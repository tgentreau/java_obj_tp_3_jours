package heritage.tp_4.ex_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanningJournee {
    private LocalDate date;
    private List<MiniExcursionPlanifiee> miniExcursionPlanifiee = new ArrayList<>();

    public PlanningJournee(LocalDate date, List<MiniExcursionPlanifiee> miniExcursionPlanifiee) {
        this.setDate(date);
    }

    public List<MiniExcursionPlanifiee> getMiniExcursionPlanifiee() {
        return miniExcursionPlanifiee;
    }

    public void setMiniExcursionPlanifiee(List<MiniExcursionPlanifiee> miniExcursionPlanifiee) {
        this.miniExcursionPlanifiee = miniExcursionPlanifiee;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanningJournee{");
        sb.append("date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
