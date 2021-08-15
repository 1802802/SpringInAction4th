package first;

import lombok.Data;

import java.io.PrintStream;

@Data
public class SlayDragonQuest implements Quest {
    private final PrintStream stream;

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
