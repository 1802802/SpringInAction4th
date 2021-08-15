package first;

import lombok.Data;

@Data
public class BraveKnight implements Knight {
    private final Quest quest;

    public void embarkOnQuest() {
        quest.embark();
    }
}
