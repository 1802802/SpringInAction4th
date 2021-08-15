package first;

import lombok.Data;

@Data
public class DamselRescuingKnight implements Knight {
    private final RescueDamselQuest quest;

    public void embarkOnQuest() {
        quest.embark();
    }
}
