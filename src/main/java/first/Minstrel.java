package first;

import lombok.Data;

import java.io.PrintStream;

@Data
public class Minstrel {
    private final PrintStream stream;

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight did embark on a quest!");
    }
}
